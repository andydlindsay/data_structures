package LinkedLists;

public class App {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.printList();
		System.out.println(list.getLength());
		
		list.addNode(new Node(7));
		list.printList();
		System.out.println(list.getLength());
		
		list.addNode(new Node(10));
		list.printList();
		System.out.println(list.getLength());
		
		list.addNode(new Node(3)).addNode(new Node(5));
		list.printList();
		System.out.println(list.getLength());
		
		list.removeNodeAtIndex(0);
		list.printList();
		
		list.insertNodeAtIndex(new Node(9), 2);
		list.printList();
		
		list.insertNodeAtIndex(new Node(2), 0);
		list.printList();

		list.insertNodeAtIndex(new Node(11), 17);
		list.printList();
		
	}

}
