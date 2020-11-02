/*
 * Implementation of Singly Linked List in Java.
 * Author: Deep Roychoudhury
*/

package com.deep;

//Singly Linked List Node for creating LinkedList
class SinglyLinkedListNode{
	int val;
	SinglyLinkedListNode next;
	
	//Constructors for SinglyLinkedList
	public SinglyLinkedListNode() {
	}
	public SinglyLinkedListNode(int val) {
		super();
		this.val = val;
	}
	public SinglyLinkedListNode(int val, SinglyLinkedListNode next) {
		super();
		this.val = val;
		this.next = next;
	}	
	
	//Insertion of Singly Linked List
	public SinglyLinkedListNode insert(SinglyLinkedListNode slln,int val){
		
		if(slln == null) return createNewLinkedListNode(val);		
		
		slln.next = insert(slln.next, val);
		
		return slln;
	}
	
	//Creating a new node if the node is null or empty
	public SinglyLinkedListNode createNewLinkedListNode(int val){
		SinglyLinkedListNode slln = new SinglyLinkedListNode();
		slln.val = val;
		slln.next = null;
		
		return slln;
	}
	
	//Printing the SinglyLinkedList
	public void print(SinglyLinkedListNode node){
		if(node != null){
			System.out.print(node.val);
			print(node.next);
		}
	}
}

public class SinglyLinkedList {

	//For counting the size of Singly Linked List
	static int count = 0;
	
	public static void main(String[] args) {
		SinglyLinkedListNode slln = new SinglyLinkedListNode(2);
		count++;
		slln = slln.insert(slln, 7);
		count++;
		slln = slln.insert(slln, 1);
		count++;
		slln = slln.insert(slln, 0);
		count++;
		slln = slln.insert(slln, 9);
		count++;
		slln = slln.insert(slln, 8);
		count++;
		slln = slln.insert(slln, 4);
		count++;
		slln.print(slln);
	}

}
