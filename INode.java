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

	public void printAllValues();

}