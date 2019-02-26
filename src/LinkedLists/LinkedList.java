package LinkedLists;

public class LinkedList {
	
	public Node head;

	public LinkedList() {
		this.head = null;
	}
	
	public int getLength() {
		int counter = 0;
		
		if (this.head == null) {
			return counter;
		}
		
		Node currentNode = this.head;
		
		while (currentNode != null) {
			counter += 1;
			currentNode = currentNode.nextNode;
		}
		
		return counter;
	}
	
	public void printList() {
		if (this.getLength() == 0) {
			System.out.println("linked list is empty");
			return;
		}
		
		Node currentNode = this.head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
		
		System.out.println();
	}
	
	public void insertNodeAtIndex(Node node, int index) {
		if (index == 0) {
			node.nextNode = this.head;
			this.head = node;
			return;
		}
		
		int counter = 0;
		Node currentNode = this.head;
		Node previousNode = null;
		
		while (currentNode != null) {
			if (counter == index) {
				previousNode.nextNode = node;
				node.nextNode = currentNode;
				return;
			}
			
			previousNode = currentNode;
			currentNode = currentNode.nextNode;
			counter++;
		}
		
		previousNode.nextNode = node;
	}
	
	public void removeNodeAtIndex(int index) {
		if (index == 0) {
			if (this.head.nextNode != null) {
				this.head = this.head.nextNode;
			} else {
				this.head = null;
			}
			return;
		}
		
		int counter = 0;
		Node currentNode = this.head;
		Node previousNode = null;
		
		while (currentNode != null) {
			if (counter == index) {
				previousNode.nextNode = currentNode.nextNode;
				return;
			}
			previousNode = currentNode;
			currentNode = currentNode.nextNode;
			counter++;
		}
	}
	
	public LinkedList addNode(Node node) {
		if (this.head == null) {
			this.head = node;
		} else {
			Node currentNode = this.head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = node;
		}
		return this;
	}
	
}
