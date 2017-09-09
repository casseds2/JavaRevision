class PrintReverse{
	public static void main(String[] args) {
		String [] words = {"Hello", "I", "Am", "Stephen"};
		writeReverse(words, 2);
	}

	static void writeReverse(String [] s, int n){
		if(n == 1){
			System.out.println(s[0]);
			return;
		}
		System.out.println(s[n-1]);
		writeReverse(s, n-1);
	}
}