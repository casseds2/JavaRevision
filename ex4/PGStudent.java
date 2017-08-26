class PGStudent extends Student{

	private String personalSupervisor;

	PGStudent(){}


	PGStudent(String name, String programme, String personalSupervisor){
		super(name, programme);
		this.personalSupervisor = personalSupervisor;
	}

	void put(){
		super.put();
		System.out.print(" (" + personalSupervisor + ")");
	}
}