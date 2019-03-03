package stacks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void canUnshiftNewNode() {
		Stack<String> stack = new Stack<String>();
		stack.unshift("Mary");
		assertEquals(stack.size(), 1);
	}
	
	@Test
	void canShiftNodeFromFrontOfList() {
		Stack<String> stack = new Stack<String>();
		stack.unshift("Mary");
		stack.unshift("Teri");
		Node<String> shiftedNode = stack.shift();
		assertEquals(shiftedNode.getData(), "Teri");
	}

}
