class LinkedQueue<T> {
	
	private static class Node<T> {            
		private T item;			// data in node     
		private Node<T> next = null;	// successor node 
		                                                          
		Node(T item0, Node<T> next0) { 
			item = item0; next = next0;
		}
	}
		
	private Node<T> head = null; 
	private Node<T> tail = null; // both null, or neither null

	LinkedQueue(){}
	
	LinkedQueue(int n){} // for compatibility with bounded queue

	boolean isEmpty() {return(head==null);}

	boolean enq(T t) { 
		Node<T> tNode = new Node<>(t,null); // new tail node
		if (tail!=null) 
			tail.next = tNode; 
		else 
			head = tNode;
		tail = tNode;
		return true;
	}

	T deq() {
		Node<T> temp = head;
		head = head.next;
		return temp.item;
	}

	void put(){
		Node<T> h = head;
		System.out.print("[");
		while(h.next != null){
			System.out.print(h.item + ", ");
			h = h.next;
			if(h.next == null)
				System.out.println(h.item + "]");
		}
	}
}
