import java.util.*;

class ArrayList<T>{
	
	private T[] seq = (T[])(new Object[1024]); // 1024 arbitrary
	private int numItems = 0; // seq[0..numItems-1] significant

	//return the first index of t
	public int indexOf(T t){
		System.out.println("T: " + t);
		for(int i = 0; i < numItems-1; i++){
			System.out.println("Seq[i]: " + seq[i]);
			if(seq[i] == t){
				return i;
			}
		}
		return -1;
	}

	//Add t the be the first element
	//Implement an addFirst Method
	public void addFirst(T t){
		
	}
		
	public T remove(int i){
		if(numItems >= i){
			T temp = seq[i];
			seq[i] = null;
			numItems--;
			return temp;
		}
		return null;
	}

	public int size() {return(numItems);}
	
	public T get(int i) {
		if (i<0||i>=numItems) throw new IndexOutOfBoundsException();
		else return seq[i];
	}
	
	public T set(int i, T t) {
		if (i<0||i>=numItems) throw new IndexOutOfBoundsException();
		else { 
			T temp = seq[i]; seq[i] = t;
			return temp;
		}
	}

	public boolean add(T t) { 
		add(numItems,t);
		return true; // for compatibility reasons only
	}

	public void add(int i, T t) {
		if (i<0 || i>numItems) throw new IndexOutOfBoundsException();
		if (numItems==seq.length) resize(); // extend seq
		for (int k=numItems; k>i; k--) // shift seq[i..] to right
			seq[k] = seq[k-1];
		seq[i] = t; numItems++;
	}		
				
	private void resize() { // seq is full -- double its size
		T[] temp = (T[])(new Object[seq.length*2]); // bigger array
		for (int i=0; i<seq.length; i++) // copy over items 
			temp[i] = seq[i];
		seq = temp; 
	}
}