package com.bridgelabz.linkedList;

public interface INode<T> {
	
	public T getKey();
	
	public void setKey(T key);
	
	public INode<T> getNext();
	
	public void setNext(T key);
	
	public T getHead1();
	
	public void setHead(T head);
	
	public T getTail();
	
	public void setTail(T tail);
	
	public void add(T newNode);

	public void append(T newNode);
	
	public void insertInBetween(T newKey, T key);

	public void pop();
	
	public void popLastElement();
	
	public boolean findNode(T value);

	public void insertNumberAfterGivenNodeKey(T newKey, T key); 
	
        public void deleteNode(T key); 

	public void addLinkedList(T key);

	private int sort(Node<T> temp, Node<T> newNode);

}