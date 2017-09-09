class Sum{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("Sum(" + num + ") : " + rSum(num));
	}

	static int rSum(int n){
		if(n < 10){
			return n;
		}
		return rSum(n / 10) + rSum(n % 10);
	}
}