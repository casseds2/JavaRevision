class PersonTest{
	public static void main(String[] args) {  
    	
    	Person [] people = {
			new Student("Mike Smith","10 Main St", true, "5023765", "Computing", 2),
			new Lecturer("Kay Brown", "25 Side St", false, "Business", "3734564")
		};
		
		for(int i = 0; i < people.length; i++){
			people[i].put();
			System.out.println();
		}
	}
}