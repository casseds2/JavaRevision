class Bag <T extends Comparable<T>>{

	private T [] bag = (T[])(new Comparable[100]);
	private int count = 0;

	int getCount(){
		return count;
	}

	void add(T x){
		bag[count] = x;
		count++;
	}

	void remove(T x){
		for(int i = 0; i < count; i++){
			if(bag[i].equals(x)){
				bag[i] = null;
				count --;
				adjust();
			}
		}
	}

	void put(){
		for(int i = 0; i < count; i++){
			System.out.println(bag[i]);
		}
		System.out.println();
	}

	void adjust(){
		for(int i = 0; i < count; i++){
			if(bag[i] == null && bag[i + 1] != null){
				bag[i] = bag[i + 1];
				bag[i + 1] = null;
				i = 0;
			}
		}
	}

	int numGreater(T x){
		int numCount = 0;
		for(int i = 0; i < count; i++){
			System.out.println(bag[i].toString() + " || " + x.toString());
			if(bag[i].compareTo(x) > 0){
				numCount++;
			}
			System.out.println();
		}
		return numCount;
	}
}