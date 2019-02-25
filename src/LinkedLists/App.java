package LinkedLists;

public class App {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		System.out.println("list length is " + list.getLength());
		list.printList();
		
		list.addNode(new Node(7));
		System.out.println("list length is " + list.getLength());
		list.printList();
		
		list.addNode(new Node(10));
		System.out.println("list length is " + list.getLength());
		list.printList();

	}

}
