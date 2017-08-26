class Rectangle extends Shape{

	private double width, height;

	//Rectangle(){} //Cant Have No Args Constructor With Abstract

	Rectangle(String name, double width, double height){
		super(name);
		this.width = width;
		this.height = height;
	}

	double area(){
		return width * height;
	}

	double perim(){
		return width * 2 + height * 2;
	}

}