class Staff{

	private Employee [] staff;

	Staff(){
		staff = new Employee [20];
	}

	void fire(Employee e){
		for(int i = 0; i < staff.length; i++){
			if(staff[i] != null && e.equals(staff[i])){
				staff[i] = null;
				System.out.println("Fired: " + e.getName());
				i = staff.length;
			}
		}
	}

	void hire(Employee e) throws Exception{
		for(int i = 0; i < staff.length; i++){
			if(null == staff[i]){
				staff[i] = e;
				System.out.println("Hired: " + e.getName());
				i = staff.length;
			}
		}
	}

	void put(){
		System.out.println();
		for(int i = 0; i < staff.length; i++){
			if(staff[i] != null){
				staff[i].put();
				System.out.println();
			}
		}
	}

}