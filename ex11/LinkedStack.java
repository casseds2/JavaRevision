class LinkedStack<T> {

	private Node<T> head = null;
	private int count = 0;

	LinkedStack() {}

	LinkedStack(int n) {}

	boolean isEmpty() {return(head==null);}

	boolean push(T t) { 
		head = new Node<>(t,head);
		count++;
		return true;
	}

	T pop() { 
		if (head==null) return null;
		T t = head.item;
		head = head.next;
		count--;
		return t;
	}

	int size() {
		return count;
	}
}
