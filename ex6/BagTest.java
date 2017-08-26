class BagTest{
	public static void main(String [] args){
		Bag<Integer> ints = new Bag<>();
		ints.add(10);
		ints.add(11);
		ints.add(12);
		ints.add(13);
		ints.put();
		ints.remove(12);
		ints.put();
		ints.add(14);
		ints.add(15);
		ints.put();
		ints.remove(11);
		ints.remove(13);
		ints.put();
		System.out.println("Count: " + ints.getCount());
	}
}