public class Test{
	public static void main(String [] args){
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Time t1 = new Time(12, 15);
		Time t2 = new Time(13, 15);
		Printable [] objects = new Printable[4];
		objects[0] = p1;
		objects[1] = p2;
		objects[2] = t1;
		objects[3] = t2;
		printIt(objects);
	}

	static void printIt(Printable[] x){
		for(int i = 0; i < x.length; i++){
			x[i].put();
		}
	}

}