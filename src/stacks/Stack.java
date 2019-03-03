package stacks;

public class Stack<T extends Comparable <T>> implements IStack<T> {

	private Node<T> root;
	private int sizeOfList;
	
	// private methods
	private void insertDataAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(this.root);
		this.root = newNode;
	}
	
	// public methods
	public void push(T data) {
		this.sizeOfList++;
		if (this.root == null) {
			this.root = new Node<>(data);
		} else {
			insertDataAtBeginning(data);
		}
	}
	
	public void traverseStack() {
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
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
}
