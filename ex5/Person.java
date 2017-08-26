abstract class Person{

	String name, address;
	boolean gender;

	Person(){}

	Person(String name, String address, boolean gender){
		this.name = name;
		this.address = address;
		this.gender = gender;
	}

	abstract int completionYear();

	void put(){
		String sex;
		if(gender)
			sex = "Male";
		else
			sex = "Female";
		System.out.print(name + ", " + address + ", " + sex);
	}
}