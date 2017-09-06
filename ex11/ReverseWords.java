class ReverseWords {
	public static void main(String[] args) {
		UnboundedStack<String> stack = new UnboundedStack<>();
		System.out.println("Enter text");
		String s = "";
		while (!Console.endOfFile()){
			stack.push(Console.readToken());
		}
		while(!stack.isEmpty()) {
			s = s + stack.pop() + " ";
		}
		System.out.println(s);
	}
}