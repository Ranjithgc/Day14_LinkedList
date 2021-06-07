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

	/**
         * uc4 : ability to insert an element in between
         */
        public void insertInBetween(T newKey, T key) {
        	Node<T> node = head;
        	Node<T> temp;
        	Node<T> newNode = new Node<T>(newKey);
        	while(node != null) {
            		if(node.getData() == key) {
                		break;
            		}
        		node = node.getNext();
        	}
        	temp = node.getNext();
        	node.setNext(newNode);
        	newNode.setNext(temp);
    	}

	/**
         * uc5 : ability to delete the first element
        */
        public void pop() {
        	Node<T> node = head;
        	head = node.getNext();
        	node.setNext(null);
    	}

	/**
         * uc6 : ability to delete the last element from the given sequence.
        */
        public void popLastElement() {
        	Node<T> node = head;
        	while(node.getNext() != tail) {
            		node = node.getNext();
        	}
        	node.setNext(null);
        	tail = node;
    	}

	/**
         * uc7: ability to search LL to find node with certain value
        */
        public boolean findNode(T value) {
        	Node<T> node = head;
        	while(node != null) {
            		if(node.getData() == value)
                	return true;
            		node = node.getNext();
        	}
        	return false;
    	}
	
	/**
        * uc8: ability to insert number after given value to the LL sequence
        */ 
        public void insertNumberAfterGivenNodeKey(T newKey, T key) {
        	Node<T> node = head;
        	Node<T> temp;
        	Node<T> newNode = new Node<T>(newKey);
        	while (node != null) {
            		if (node.getData() == key)
                		break;
            			node = node.getNext();
        	}
        	temp = node.getNext();
        	node.setNext(newNode);
        	newNode.setNext(temp);
    	}

	/**
         * uc9: ability to delete element from linked list sequence
        */
        public void deleteNode(T key) {
        	Node<T> node = head;
        	Node<T> prev = null;
        	while(node != null) {
            		if(node.getData() == key)
                		break;
            	prev = node;
            	node = node.getNext();
        	}
        	if(prev == null) {
            		head = head.getNext();
        	} else {
            		prev.setNext(node.getNext());
            		node.setNext(null);
        	}
    	}

	/**
         * uc10:
        */
        public void addLinkedList(T data) {
        	Node<T> newNode = new Node<T>(data);
        	if(head == null && tail == null) {
            		head = newNode;
            		tail = newNode;
        	} else {
            		Node<T> temp = null, prev = null;
            		temp = head;
            		while(temp != null) {
                		if(sort(temp,newNode) > 0) {
                    		break;
                	}
                	prev = temp;
                	temp = temp.getNext();
            	}
            	if(temp == head) {
                	newNode.setNext(temp);
                	head = newNode;
            	}
            	else if(temp == null) {
                	prev.setNext(newNode);
                	tail = newNode;
            	} else {
                	prev.setNext(newNode);
                	newNode.setNext(temp);
            	}
          }
    }

      private int sort(Node<T> temp, Node<T> newNode) {
            return ((Comparable) temp.getData()).compareTo(newNode.getData());
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