class Employee{

	private String name, dept;

	Employee(){}

	Employee(String name, String dept){
		this.name = name;
		this.dept = dept;
	}

	void put(){
		System.out.print("Employee: " + name + ", Department: " + dept);
	}

	boolean equals(Employee e){
		return name.equals(e.getName()) && dept.equals(e.getDepartment());
	}

	String getName(){
		return name;
	}

	private String getDepartment(){
		return dept;
	}
}