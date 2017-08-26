class Point implements Printable{

	private double x, y;

	Point(){}

	Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public void put(){
		System.out.println("(" + x + ", " + y + ")");
	}

}