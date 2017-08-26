class Circle extends Shape{

	private double radius;

	//Circle(){} //Cant Have No Args Constructor With Abstract

	Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	double area(){
		return 3.14 * radius * radius;
	}

	double perim(){
		return 2 * 3.14 * radius;
	}

}