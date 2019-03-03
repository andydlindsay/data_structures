package LinkedListV2;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int sizeOfList;
	
	@Override
	public void insert(T data) {
		this.sizeOfList++;
		if (this.root == null) {
			this.root = new Node<>(data);
		} else {
			insertDataAtBeginning(data);
		}
	}

	// O(1)
	private void insertDataAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(this.root);
		this.root = newNode;
	}
	
	// O(N)
	@SuppressWarnings("unused")
	private void insertDataAtEnd(T data, Node<T> node) {
		if (node.getNextNode() != null) {
			insertDataAtEnd(data, node.getNextNode());
		} else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		if (this.root == null) return;
		if (this.root.getData().compareTo(data) == 0) {
			this.root = this.root.getNextNode();
			this.sizeOfList--;
		} else {
			remove(data, this.root, this.root.getNextNode());
		}
	}

	private void remove(T data, Node<T> previousNode, Node<T> currentNode) {
		if (currentNode == null) return;
		if (currentNode.getData().compareTo(data) == 0) {
			previousNode.setNextNode(currentNode.getNextNode());
			currentNode = null;
			this.sizeOfList--;
		} else {
			remove(data, currentNode, currentNode.getNextNode());
		}
	}

	@Override
	public void traverseList() {
		if (this.root == null) return;
		Node<T> currentNode = this.root;
		while (currentNode != null) {
			System.out.print(currentNode + " ");
			currentNode = currentNode.getNextNode();
		}
		System.out.println();
	}

	@Override
	public int size() {
		return this.sizeOfList;
	}
	
}
