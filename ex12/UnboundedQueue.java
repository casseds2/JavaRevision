class UnboundedQueue<T> { // bounded

	private T[] seq; // the sequence
	private int size = 0; // size of sequence
	private int head = 0; //front
	private int tail = 0; //rear

	UnboundedQueue(int n) { // n>0
		seq = (T[])(new Object[n]); 
	}

	UnboundedQueue(){ 
		this(1); // =  seq=(T[])(new Object[1]);
	}
	
	int getSize(){
		return size;
	}

	boolean isEmpty() { return size==0;}

	boolean enq(T t) { 
		if (size < seq.length) {
			seq[tail] = t; 
			tail = (tail+1)%seq.length; 
			size++; 
			return true;
		}
		else{
			int newSize = seq.length * 2;
			T [] tempArr = (T[])(new Object[newSize]);
			for(int i = 0; i < seq.length; i++){
				tempArr[i] = seq[i];
			}
			seq = tempArr;
			seq[size] = t;
			size++;
			return true;
		}
	}

	T deq() {
		if (isEmpty()) return null;
		else {
			T temp = seq[head];
			head = (head+1)%seq.length; 
			size--;
			return temp;
		}
	}

	void print(){
		for(int i = 0; i < size; i++){
			System.out.println(seq[i]);
		}
	}
}
