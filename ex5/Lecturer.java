class Lecturer extends Person{

	private String department, number;

	Lecturer(String name, String address, boolean gender, String department, String number){
		super(name, address, gender);
		this.department = department;
		this.number = number;
	}

	int completionYear(){
		return 2017 + 65 - Integer.parseInt(number.substring(0, 2));
	}

	void put(){
		super.put();
		System.out.print(", " + department + ", " + completionYear());
	}

}