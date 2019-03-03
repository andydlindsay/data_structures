package stacks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void canPushNewNode() {
		Stack<String> stack = new Stack<String>();
		stack.push("Mary");
		assertEquals(stack.size(), 1);
	}
	
	@Test
	void canPopNodeFromFrontOfList() {
		Stack<String> stack = new Stack<String>();
		stack.push("Mary");
		stack.push("Teri");
		Node<String> poppedNode = stack.pop();
		assertEquals(poppedNode.getData(), "Teri");
		assertEquals(stack.size(), 1);
	}
	
	@Test
	void canPeekAtNextNode() {
		Stack<String> stack = new Stack<String>();
		stack.push("Mary");
		stack.push("Teri");
		Node<String> poppedNode = stack.peek();
		assertEquals(poppedNode.getData(), "Teri");
		assertEquals(stack.size(), 2);
	}

}
