class Time implements Printable{

	private int hour, min;

	Time(){}

	Time(int hour, int min){
		this.hour = hour;
		this.min = min;
	}

	public void put(){
		System.out.println(hour + ":" + min);
	}

}