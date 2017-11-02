package test;

import java.util.ArrayList;
import java.util.List;

public class LinkList {
	private int length;
	private ListNode head;

	public LinkList() {
		length = 0;
		head = null;
	}
	
	public void addNode (ListNode node) {		
		if (head == null) {			
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		length++;
	}
	
	public void printList () {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "-->");
			temp = temp.getNext();
		}
	}
	public void reverse () {
		ListNode temp = head;
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		if (current != null) {
			while (current.getNext() != null) {
				next = current.getNext();
				current.setNext(prev);
				prev = current;
				current = next;						
			}
			current.setNext(prev);
			head = current;
		}
	}
	
	public void reverseRecursive (ListNode list) {		
		if (list.getNext() == null) {
			head = list;
			return;
		}		
		reverseRecursive(list.getNext());
		ListNode temp = list.getNext();
		temp.setNext(list);
		list.setNext(null);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		LinkList ll = new LinkList();
		List<Integer> l = new ArrayList<>();
		ListNode node = new ListNode(1);
		ll.addNode(node);
		node = new ListNode(2);
		ll.addNode(node);
		node = new ListNode(3);
		ll.addNode(node);
		node = new ListNode(4);
		ll.addNode(node);
		ll.printList();
		System.out.println();
		
		ll.reverseRecursive(ll.head);			
		System.out.println();
		ll.printList();
	}

}
