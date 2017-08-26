class Student extends Person{

	private String number, subject;
	private int year;

	Student(String name, String address, boolean gender, String number, String subject, int year){
		super(name, address, gender);
		this.number = number;
		this.subject = subject;
		this.year = year;
	}

	int completionYear(){
		return 2017 + 5 - year;
	}

	void put(){
		super.put();
		System.out.print(", " + number + ", " + subject + ", " + completionYear());
	}
}