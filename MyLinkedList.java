package com.bridgelabz.linkedList;

public class MyLinkedList<T> implements INode {
	
	private INode head;
	private INode tail;
	
	public MyLinkedList( ) {
		this.head = null;
		this.tail = null;
	}
	
	public INode getHead() {
		return head;
	}

	public void setHead(INode head) {
		this.head = head;
	}

	public INode getTail() {
		return tail;
	}

	public void setTail(INode tail) {
		this.tail = tail;
	}

	// 1 -> 70 -> tail = 70 & head = 70
	// 2 -> 30 -> tail = 70 & head = [30, Address(70)],[tail]
	// 3 -> 56 -> tail = 70 & head = [56, Address(30)],[30,Address(70)],[tail]
	public void add(INode newNode) {
		if(tail == null) {
			tail = newNode;
		}
		if(head == null) {
			head = newNode;
		} else {
			INode temp = head;
			head = newNode;
			head.setNext(temp);
		}
	}

	/**
         * uc3 : Ability to create Linked List by appending 30and 70 to 56
        */
        public void append(T data) {
        	Node<T> newNode = new Node<T>(data);
       		if (head == null && tail == null) {
            		head = newNode;
            		tail = newNode;
        	} else {
            		tail.setNext(newNode);
            		tail = newNode;
        	}
    	}

	public void printAllValues() {
		StringBuilder str = new StringBuilder("The Values Are: ");
		INode tempNode = head;
		while(tempNode.getNext()!=null) {
			str.append(tempNode.getKey());
			if(tempNode.equals(tail)) {
				str.append("->");
			}
		}
		str.append(tempNode.getKey());
		System.out.println(str);
	}
}