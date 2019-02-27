package LinkedLists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LinkedListTest {
	
	@Test
	void canAddNewNode() {
		LinkedList list = new LinkedList();
		list.addNode(new Node(3));
		assertEquals(list.getLength(), 1);
	}
	
	@Test
	void canGetListLength() {
		LinkedList list = new LinkedList();
		list.addNode(new Node(5)).addNode(new Node(7));
		assertEquals(list.getLength(), 2);
	}
	
	@Test
	void canGetNodeAtIndex() {
		LinkedList list = new LinkedList();
		list.addNode(new Node(3)).addNode(new Node(5));
		Node result = list.getNodeAtIndex(1);
		assertEquals(result.data, 5);
	}
	
	@Test
	void canInsertNodeAtIndex() {
		LinkedList list = new LinkedList();
		list.addNode(new Node(3)).addNode(new Node(5));
		list.insertNodeAtIndex(new Node(4), 1);
		assertEquals(list.getLength(), 3);
		assertEquals(list.getNodeAtIndex(1).data, 4);
	}
	
	@Test
	void canRemoveNodeAtIndex() {
		LinkedList list = new LinkedList();
		list.addNode(new Node(3)).addNode(new Node(4)).addNode(new Node(5));
		list.removeNodeAtIndex(1);
		assertEquals(list.getLength(), 2);
		assertEquals(list.getNodeAtIndex(0).data, 3);
		assertEquals(list.getNodeAtIndex(1).data, 5);
	}

}
