package stacks;

public class Stack<T extends Comparable <T>> {

	private Node<T> root;
	private int sizeOfList;
	
	public void push(T data) {
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
	
	public void traverseList() {
		if (this.root == null) return;
		Node<T> currentNode = this.root;
		while (currentNode != null) {
			System.out.print(currentNode + " ");
			currentNode = currentNode.getNextNode();
		}
		System.out.println();
	}
	
	public Node<T> pop() {
		if (this.root == null) return null;
		this.sizeOfList--;
		Node<T> shiftedNode = this.root;
		this.root = this.root.getNextNode();
		return shiftedNode;
	}
	
	public Node<T> peek() {
		return this.root;
	}

	public int size() {
		return this.sizeOfList;
	}
	
}
