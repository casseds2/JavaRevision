import java.util.*;
    
class DoubleLinkedList<T> {
		
	private static class Node<T> {            
		private T item; 				// data       
		private Node<T> next = null;	// successor node 
		private Node<T> pred = null;	// predecessor node 
	                                                          
		Node(T item0, Node<T> pred0, Node<T> next0) { 
			item = item0; 
			pred = pred0; 
			next = next0;
		}
	}

	private Node<T> head = null; // first node (null if list empty)
	private Node<T> tail = null; // final node (null if list empty)
	private int numItems = 0;	  // number of items

	public void add(T t){
		if(numItems == 0){
			Node<T> newNode = new Node<>(t, null, null);
			head = newNode;
			tail = newNode;
			numItems++;
		}
		else{
			Node<T> newNode = new Node(t, tail, null);
			if(head.next == null){
				head.next = newNode;	
			}
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void put(){
		Node<T> temp = head;
		if(temp != null && temp.next == null){
			System.out.println("[" + head.item + "]");
			return;
		}
		System.out.print("[");
		while(temp.next != null){
			System.out.print(temp.item + ", ");
			temp = temp.next;
		}
		System.out.println(temp.item + "]");
	}
}