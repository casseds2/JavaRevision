class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> ws = new LinkedList<>();
		ws.addFirst("cat"); 
		ws.addFirst("dog");                                         
		ws.addFirst("cow"); 
		ws.addFirst("dog");
		ws.addFirst("pig");
		ws.put();
		//{pig, dog, cow, dog, cat}
		System.out.println("Index of Dog: " + ws.indexOf("dog"));
		ws.remove(ws.indexOf("cow"));
		System.out.println("Removed Cow...");
		ws.put();
		System.out.println("Index of Cat: " + ws.indexOf("cat"));	
		System.out.println("Index of Hen: " + ws.indexOf("hen"));
		ws.leftRotate();
		ws.put();
	}
}