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
	
}
