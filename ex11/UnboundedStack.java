class UnboundedStack<T> { // bounded

	private T[] seq; // the sequence
	private int size = 0; // size of sequence
	
	UnboundedStack(int n) { // n>0
		seq = (T[])(new Object[n]);
	}

	UnboundedStack() { 
		seq = (T[])(new Object[5]);  // or this(10000);
	}

	int getSize(){
		return size;
	}

	boolean isEmpty() { return size==0;}

	boolean push(T t) { 
		if (size<seq.length) {
				seq[size] = t; 
				size++;
				return true;
		}
		else{
			int newSize = seq.length * 2;
			T [] newSeq = (T[])(new Object[newSize]);
			for(int i = 0; i < seq.length; i++){
				newSeq[i] = seq[i];
			}
			seq = newSeq;
			seq[size] = t;
			size++;
			return true;
		}
	}
	
	T pop() {
		if (isEmpty()){
			return null;
		}
		else {
			size--;
			return seq[size];
		}
	}
}