package test;

public class ListNode {
	private int data;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	private ListNode next;
	public ListNode() {
		// TODO Auto-generated constructor stub
		data = 0;
		next = null;
	}
	
	public ListNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		next = null;
	}

}
