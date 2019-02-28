package LinkedListV2;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.insert(10);
		list.insert(7);
		list.insert(14);
		list.insert(12);
		list.insert(9);
		
		list.traverseList();
		System.out.println("list size == " + list.size());
		
		list.remove(10);
		list.traverseList();
		System.out.println("list size == " + list.size());
		
		list.remove(21);
		list.traverseList();
		System.out.println("list size == " + list.size());
		
	}
	
}
