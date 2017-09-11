import java.util.*;

class LinkedList<T> {
		
	private static class Node<T> {            
		private T item; 				// data       
		private Node<T> next;			// successor node 
	                                                          
		Node(T item0, Node<T> next0) { 
			item = item0; next = next0;
		}
	}
		
	private Node<T> head = null; // first node (null if list empty)
	private Node<T> tail = null; // final node (null if list empty)
	private int numItems = 0;	  // number of items

	public int size() {return(numItems);}

	public T get(int i) {
		if (i<0||i>=numItems) throw new IndexOutOfBoundsException();
		Node<T> p = head; int pIndex = 0; // Node p at index pIndex
		while (pIndex!=i) {
			p = p.next; pIndex++;
		}
		return p.item;
	}
	
 	public int indexOf(T t){
 		Node<T> temp = head;
 		int count = 0;
 		boolean itemFound = false;
 		while(temp.next != null){
 			if(temp.item == t)
 				return count;
 			temp = temp.next;
 			count++;
 		}
 		if(temp.item == t)
 			return count;
 		return -1;
 	}

 	public void put(){
 		Node<T> temp = head;
 		System.out.print("[");
 		while(temp.next != null){
 			System.out.print(temp.item + ", ");
 			temp = temp.next;
 		}
 		System.out.print(temp.item);
 		System.out.println("]");
 	}

 	public void addFirst(T t){
 		if(head == null){
 			head = new Node<T>(t, null);
 			tail = head;
 		}
 		else{
 			Node<T> newNode = new Node<>(t, head);
 			head = newNode;
 		}	
 		numItems++;
 	}

 	public void leftRotate(){
 		if(numItems > 1){
 			Node<T> newNode = new Node<>(head.item, null);
 			tail.next = newNode;
 			tail = newNode;
 			head = head.next;
 		}
 	}

	public T set(int i, T t) {
		if (i<0||i>=numItems) throw new IndexOutOfBoundsException();
		Node<T> p = head; int pIndex = 0; // Node p at index pIndex
		while (pIndex!=i) {
			p = p.next; pIndex++;
		}
		T temp = p.item; p.item = t;
		return temp;
	}
	
	public boolean add(T t) { 
		Node<T> tNode = new Node<T>(t,null); // new tail node
		if (tail!=null) tail.next = tNode; 
		else head = tNode;
		tail = tNode;
		numItems++;
		return true; // for compatibility reasons only
	}

	public void add(int i, T t) { 
		if (i<0 || i>numItems) throw new IndexOutOfBoundsException();
		if (i==0) { // insert at front
			head = new Node<T>(t,head);
			if (tail==null) tail = head;
		}
		else { // not at front
			Node<T> p = head;
			int index = 1; // p references node at position index-1
			while (index!=i) {
				p = p.next; index++;
			} // node p at position i-1
			p.next = new Node<T>(t,p.next); // insert t following p
			if (tail==p) tail = p.next;
		}
		numItems++;
	}	
	
	public T remove (int i) {
		if(i == 0){
			head = head.next;
			return head.item;
		}
		Node<T> temp = head;
		int count = 0;
		while(temp.next != null){
			if(count == i-1){
				// System.out.println("Count Reached(count(" + count + ") & i(" + i + "))");
				// System.out.println("Temp.next.item: " + temp.next.item);
				temp.next = temp.next.next;
				return temp.next.item;
			}
			else{
				//System.out.println("Parsed: " + temp.item);
				temp = temp.next;
				count++;
			}
		}
		return null;
	}			
}