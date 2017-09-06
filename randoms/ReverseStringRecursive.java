class ReverseStringRecursive{
	public static void main(String [] args){
		String s = "evil rats on no star live";
		System.out.println(reverse(s));
	}

	private static String reverse(String s){
		if(s.length() == 0){
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}	
}
