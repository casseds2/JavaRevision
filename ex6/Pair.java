class Pair <T, U> {

	private T x;
	private U y;

	Pair(T x, U y){
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return x + " " + y;
	}
}