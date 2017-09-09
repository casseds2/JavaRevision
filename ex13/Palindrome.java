class Palindrome{
	public static void main(String[] args) {
		//String s = "evil rats on no sar live";
		String s = "evil rats on no star live";
		System.out.println("Pal(" + s + "): " + pal(s));
	}

	static boolean pal(String s){
		if(s.length() < 2){
			return true;
		}
		else{
			if(s.charAt(0) != s.charAt(s.length() - 1))
				return false;
			else
				return pal(s.substring(1, s.length() - 1));
		}
	}
}