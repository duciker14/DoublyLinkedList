package basic.dev;

public class Node {
	protected int value;
	protected Node next;
	protected Node pre;
	
	public Node(int number) {
		value = number;
	}
	
	public void printNumber() {
		System.out.print(value + ", ");
	}
}
