class DateADT{
	public static void main(String [] args){

		Date first = new Date();
		Date second = new Date();
		first.get();
		second.get();
		if(first.lte(second))
			System.out.println(first.toString()  + " came first.");
		else
			System.out.println(second.toString() + " came first.");			
	}
}