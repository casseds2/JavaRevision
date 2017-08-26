class DateTest{
	public static void main(String [] args){

		Bag<Date> dates1 = new Bag<>();
		Date d1 = new Date(1, 1, 2017);
		Date d2 = new Date(1, 2, 2017);
		dates1.add(d1);
		dates1.add(d2);
		Bag<Date> dates2 = new Bag<>();
		Date d3 = new Date(1, 3, 2017);
		Date d4 = new Date(1, 4, 2017);
		dates2.add(d3);
		dates2.add(d4);
		dates1.put();
		dates2.put();
		System.out.println(dates2.numGreater(new Date(1, 1, 2100)));
	}
}