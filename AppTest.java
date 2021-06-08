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
        public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult(){
        	Node<Integer> MyFirstNode=new Node<>(56);
        	Node<Integer> MySecondNode=new Node<>(30);
        	Node<Integer> MyThirdNode=new Node<>(70);
        	MyLinkedList linkedList=new MyLinkedList();
        	linkedList.add(MyFirstNode);
        	linkedList.append(MyThirdNode);
        	linkedList.insert(MyFirstNode,MySecondNode);
        	boolean result=linkedList.head.equals(MyFirstNode)&&
                linkedList.head.getNext().equals(MySecondNode)&&
                linkedList.tail.equals(MyThirdNode);

        	Assert.assertTrue(result);
        	linkedList.PrintAllValues();
       }

	// Deleting First Element
       @Test
       public void given3NumberswhenDeletingFirstElementShouldPassTheLinkedList(){
        	Node<Integer> MyFirstNode=new Node<>(56);
        	Node<Integer> MySecondNode=new Node<>(30);
        	Node<Integer> MyThirdNode=new Node<>(70);
        	MyLinkedList linkedList=new MyLinkedList();
        	linkedList.add(MyFirstNode);
        	linkedList.append(MySecondNode);
        	linkedList.append(MyThirdNode);
        	INode<Integer> poppedNode=linkedList.pop();
        	linkedList.PrintMyNodes();
        	Assert.assertEquals(MyFirstNode,poppedNode);
	}
    
	// Deleting Last Element
	@Test
    	public void given3NumbersDeletingLastElementShouldPassTheLinkedList() {
        	Node<Integer> MyFirstNode=new Node<>(56);
        	Node<Integer> MySecondNode=new Node<>(30);
        	Node<Integer> MyThirdNode=new Node<>(70);
        	MyLinkedList linkedList=new MyLinkedList();
        	linkedList.add(MyFirstNode);
        	linkedList.append(MySecondNode);
        	linkedList.append(MyThirdNode);
        	INode<Integer> popLastNode=linkedList.popLast();
        	linkedList.PrintMyNodes();
        	Assert.assertEquals(MyThirdNode,popLastNode);
    	}
    	
	// Searching the element 
	@Test
    	public void given3numbersWhenSearchingShouldPassTheLinkedList() {
        	Node<Integer> MyFirstNode=new Node<>(56);
        	Node<Integer> MySecondNode=new Node<>(30);
        	Node<Integer> MyThirdNode=new Node<>(70);
        	MyLinkedList linkedList=new MyLinkedList();
        	linkedList.add(MyFirstNode);
        	linkedList.append(MySecondNode);
        	linkedList.append(MyThirdNode);
        	INode<Integer> searchNode=linkedList.search(MySecondNode);
        	Assert.assertEquals(MySecondNode,searchNode);
    	}
    	
	// Inserting an element in middle of linked list 
	@Test
    	public void given4NumbersWhenInsertingInMiddleShouldPassTheLinkedList(){
        	Node<Integer> myFirstNode=new Node<>(56);
        	Node<Integer> mySecondNode=new Node<>(30);
        	Node<Integer> myThirdNode=new Node<>(40);
        	Node<Integer> myFourthNode=new Node<>(70);
        	MyLinkedList linkedList=new MyLinkedList();
        	linkedList.add(myFirstNode);
        	linkedList.append(mySecondNode);
        	linkedList.append(myFourthNode);
        	linkedList.inserInmiddle(mySecondNode,myThirdNode);
        	boolean result=linkedList.head.equals(myFirstNode)&&linkedList.head.getNext				().equals(mySecondNode)&&
                linkedList.head.getNext().getNext().equals(myThirdNode)&&
                linkedList.tail.equals(myFourthNode);
       	 	Assert.assertTrue(result);
        	linkedList.PrintAllValues();
    	}
    	
	// Delete an elment in the middle of linked list
	@Test
    	public void given4NumbersWhenDeletingMiddleShuoldPassTheresult(){
        	Node<Integer> myFirstNode=new Node<>(56);
        	Node<Integer> mySecondNode=new Node<>(30);
        	Node<Integer> myThirdNode=new Node<>(40);
        	Node<Integer> myFourthNode=new Node<>(70);
        	MyLinkedList linkedList=new MyLinkedList();
        	linkedList.add(myFirstNode);
        	linkedList.append(mySecondNode);
        	linkedList.append(myThirdNode);
        	linkedList.append(myFourthNode);
        	linkedList.deleteInMiddle(myThirdNode,mySecondNode);
        	boolean result=linkedList.head.equals(myFirstNode)&&
                	       linkedList.head.getNext().equals(mySecondNode);
        	linkedList.tail.equals(myFourthNode);
        	Assert.assertTrue(result);
        	linkedList.PrintAllValues();
    	}

	// Adding Linked List elements in Ascending order
    	@Test
    	public void givenFourNumbers_WhenAddedInLinkedList_ShouldAddedInAscendingOrder() {
        	MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        	Node<Integer> myFirstNode = new Node<>(56);
        	Node<Integer> mySecondNode = new Node<>(30);
        	Node<Integer> myThirdNode = new Node<>(40);
        	Node<Integer> myFourthNode = new Node<>(70);
        	linkedList.addInAscendingOrder(myFirstNode);
        	linkedList.addInAscendingOrder(mySecondNode);
        	linkedList.addInAscendingOrder(myThirdNode);
        	linkedList.addInAscendingOrder(myFourthNode);
        	boolean result = linkedList.head.equals(mySecondNode) &&
                linkedList.head.getNext().equals(myThirdNode) &&linkedList.head.getNext				().getNext().equals(myFirstNode)
                &&linkedList.head.getNext().getNext().getNext().equals(myFourthNode);
        	Assert.assertTrue(result);
       }
}