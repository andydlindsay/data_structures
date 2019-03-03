package stacks;

public interface IStack<T extends Comparable<T>> {
	public void push(T data);
	public Node<T> pop();
	public Node<T> peek();
	public int size();
	public void traverseStack();
	public boolean isEmpty();
}
