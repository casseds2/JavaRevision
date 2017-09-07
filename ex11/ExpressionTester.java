import java.util.ArrayList;

class ExpressionTester{
	public static void main(String[] args) {
		String s = "[a(b{cd})";
		System.out.println(isProper(s));
	}

	//Tests if valid expression with brackets
	static boolean isProper(String s){
		ArrayList<String> openBracks = new ArrayList<>();
		ArrayList<String> closingBracks = new ArrayList<>();
		openBracks.add("{");
		openBracks.add("(");
		openBracks.add("[");
		closingBracks.add("]");
		closingBracks.add(")");
		closingBracks.add("}");
		LinkedStack<String> exp = new LinkedStack<>();
		for(int i = 0; i < s.length(); i++){
			String elem = s.substring(i, i+1);
			if(openBracks.contains(elem)){
				exp.push(elem);
			}
			if(closingBracks.contains(elem)){
				if(exp.size() == 0)
					return false;
				String temp = exp.pop();
				if(temp.equals("{") && !elem.equals("}")){
					return false;
				}
				if(temp.equals("(") && !elem.equals(")")){
					return false;
				}
				if(temp.equals("[") && !elem.equals("]")){
					return false;
				}
			}
		}
		return exp.size() == 0;
	}
}