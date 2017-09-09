class Reverse{
	public static void main(String[] args) {
		String s = args[0];
		System.out.println("Reverse: " + rev(s));
	}

	static String rev(String s){
		if(s.length() == 0){
			return s;
		}
		return rev(s.substring(1)) + s.charAt(0);
	}
}