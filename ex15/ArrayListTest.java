class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> ws = new ArrayList<>();
		ws.addFirst("cat"); 
		ws.addFirst("dog");                                         
		ws.addFirst("cow"); 
		ws.addFirst("dog");
		ws.addFirst("pig");
		ws.put();
		//{pig, dog, cow, dog, cat}
		System.out.println("Index of Dog: " + ws.indexOf("dog"));
		ws.remove(ws.indexOf("dog"));
		ws.put();
		System.out.println("Index of Dog: " + ws.indexOf("dog"));	
		System.out.println("Index of Hen: " + ws.indexOf("hen"));	
	}
}
