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

	public void append(T key);

	public void insertInBetween(T newKey, T key);

	public void pop();

 	public void popLastElement();

	public boolean findNode(T key);

	public void insertNumberAfterGivenNodeKey(T newKey, T key);

	public void deleteNode(T key);

	public add LinkedList(T key);

	private T sort(Node<T> temp, Node<T> newNode)	

	public void printAllValues();

}