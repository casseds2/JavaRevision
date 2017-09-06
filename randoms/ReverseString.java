class ReverseString{
	public static void main(String [] args){
		String s = "evil rats on no star live";
		String temp = "";
		for(int i = s.length() - 1; i > -1; i--){
			System.out.println(i);
			temp = temp + s.charAt(i);
		}
		System.out.println(temp);
	}
}
