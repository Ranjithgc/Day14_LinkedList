package com.bridgelabz.linkedList;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {  
	/**
     	 * Rigorous Test :-)
     	 */
    	@Test
    	public void link3NumbersUsingMyLinkedList() {
        	Node<Integer> myFirstNode = new Node<Integer>(56);
        	Node<Integer> mySecondNode = new Node<Integer>(30);
        	Node<Integer> myThirdNode = new Node<Integer>(70);
        	myFirstNode.setNext(mySecondNode);
        	mySecondNode.setNext(myThirdNode);
        	System.out.println(mySecondNode.getNext().getKey());
        	boolean result = myFirstNode.getNext().equals(mySecondNode) &&
        				 mySecondNode.getNext().equals(myThirdNode);
       	 	Assert.assertTrue(result);
    	}

 	@Test
    	public void insert3NumbersInToMyLinkedList() {
    		Node<Integer> myFirstNode = new Node<Integer>(70);
         	Node<Integer> mySecondNode = new Node<Integer>(30);
         	Node<Integer> myThirdNode = new Node<Integer>(56);
         	MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
         	myList.add(myFirstNode);
         	myList.add(mySecondNode);
         	myList.add(myThirdNode);
         	myList.printAllValues();
         	boolean result = myList.getHead().equals(myThirdNode) &&
        		 		  myList.getHead().equals(mySecondNode) && 
        		 		  myList.getTail().equals(myFirstNode);
         	Assert.assertEquals(10, 10);
    	}
	
 	@Test
    	public void insert3NumbersInToMyLinkedList() {
    		Node<Integer> myFirstNode = new Node<Integer>(56);
         	Node<Integer> mySecondNode = new Node<Integer>(30);
         	Node<Integer> myThirdNode = new Node<Integer>(70);
         	MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
         	myList.add(myFirstNode);
         	myList.add(mySecondNode);
         	myList.add(myThirdNode);
         	myList.printAllValues();
         	boolean result = myList.getHead().equals(myThirdNode) &&
        		 		  myList.getHead().equals(mySecondNode) && 
        		 		  myList.getTail().equals(myFirstNode);
        	Assert.assertEquals(10, 10);
    	}    
	@Test
	public void returnTrueWhenFindNode() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Integer a = 56, b = 30, c = 70;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertInBetween(b, a);
		Assert.assertEquals(true, linkedList.findNode(b));
	}
	/**
	* ability to insert element after given value node key
	*/
	@Test
	public void insertNumberAfterGivenValue() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Integer a = 56, b = 30, c = 70 ;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertNumberAfterGivenNodeKey(b, a);
		Assert.assertEquals(true, linkedList.findNode(b));
	}

	/**
	* ability to delete element from LL sequence
	*/
	@Test
	public void deleteGivenNode() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Integer a = 56, b = 30, c = 70;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertNumberAfterGivenNodeKey(b, a);
		linkedList.deleteNode(b);
		Assert.assertEquals(false, linkedList.findNode(b));
	}
}