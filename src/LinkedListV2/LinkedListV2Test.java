package LinkedListV2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedListV2Test {

	@Test
	void canCreateNewNode() {
		Node<String> node = new Node<String>("Mary");
		assertEquals(node.getData(), "Mary");
	}
	
	@Test
	void canUpdateNodeData() {
		Node<String> node = new Node<String>("Mary");
		node.setData("Lamb");
		assertEquals(node.getData(), "Lamb");
	}
	
	@Test
	void canSetNextNode() {
		Node<String> node1 = new Node<String>("Mary");
		Node<String> node2 = new Node<String>("Lamb");
		node1.setNextNode(node2);
		assertEquals(node1.getNextNode().getData(), "Lamb");
	}
	
	@Test
	void canInsertNodeIntoList() {
		LinkedList<String> list = new LinkedList<String>();
		list.insert("Mary");
		assertEquals(list.size(), 1);
	}
	
	@Test
	void canRemoveNodeInList() {
		LinkedList<String> list = new LinkedList<String>();
		list.insert("Mary");
		list.insert("Lamb");
		assertEquals(list.size(), 2);
		list.remove("Mary");
		assertEquals(list.size(), 1);
	}
	
	@Test
	void willNotRemoveNodeIfNotFound() {
		LinkedList<String> list = new LinkedList<String>();
		list.insert("Mary");
		list.insert("Lamb");
		assertEquals(list.size(), 2);
		list.remove("Barry");
		assertEquals(list.size(), 2);
	}
	
	@Test
	void canTraverseTheList() {
		LinkedList<String> list = new LinkedList<String>();
		list.insert("Mary");
		list.insert("Lamb");
		list.insert("Bari");
		list.insert("Teri");
		assertEquals(list.size(), 4);
		list.traverseList();
	}
	
}
