package edu.monmouth.hw2;

import edu.monmouth.book.Book;

public class ListNode {

  private Node head; 

  public ListNode() {
    head = null;
  }
  
  public Node removeFirst() {
	  if (isEmpty()) {
			return null;
	  }
	  Node removeFirst = head.getNext();
	  return removeFirst;
  }
  
  
  public Node first() {
	return head;
  }
  
  public Node last() {
	  if (isEmpty()) {
		  return null;
	  }
	  Node last = head;
	  while(last.getNext() != null) {
		  last = last.getNext();
	  }
	  return last;
  }

  public void insert(Book element) {
    Node newNode = new Node(element);
    newNode.setNext(head);
    head = newNode;
  }

  public void insertEnd(Book element) {
	  if (isEmpty()) {
		  insert(element);
		  return;
	  }
	return; 
}

 public boolean isEmpty() { 
	return head == null;              
  }
  
  public int size() {
    int count = 0;
    Node current = head;
    while (current != null) {
    	count++;
    	current = current.getNext();
    }
    return count;
  }
    
  public void clear() {
    head = null;
  }

@Override
  public String toString() {
	StringBuilder bookList = new StringBuilder();
	Node current = head;
	while (current != null) {
		bookList.append(current.toString()).append("\n");
		current = current.getNext();
	}
	return bookList.toString();
  }
}
