package LinkedLists;

public class LinkedList {
	
	public Node head;

	public LinkedList() {
		this.head = null;
	}
	
	public int getLength() {
		int counter = 0;
		
		Node currentNode = this.head;
		if (currentNode != null) {
			counter += 1;
		}
		
		while (currentNode != null && currentNode.nextNode != null) {
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
		System.out.print(currentNode.data + " ");
		while (currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
			System.out.print(currentNode.data + " ");
		}
		System.out.println();
	}
	
	public void addNode(Node node) {
		if (this.head == null) {
			this.head = node;
		} else {
			Node currentNode = this.head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = node;
		}
	}
	
}
