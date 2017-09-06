class Stack<T> { // bounded

	private T[] seq; // the sequence
	private int size = 0; // size of sequence
	
	Stack(int n) { // n>0
		seq = (T[])(new Object[n]);
	}

	Stack() { 
		seq = (T[])(new Object[10]);  // or this(10000);
	}

	boolean isEmpty() { return size==0;}

	boolean push(T t) { 
		if (size<seq.length) {
			seq[size] = t;
			size++;
			System.out.println("Pushed to Stack");
			return true;
		}
		else return false;
	}
	
	T pop() {
		if (isEmpty()) return null;
		else {
			size--; return seq[size];
		}
	}
}
