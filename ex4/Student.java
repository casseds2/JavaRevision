class Student {

	private String name;
	private String programme;

	Student(){}

	Student(String name0, String programme0) {
		name = name0; programme = programme0;
	}

	void put() {
		System.out.print(name + ": " + programme);
	}
}