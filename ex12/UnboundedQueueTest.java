class UnboundedQueueTest{
	public static void main(String[] args) {
		UnboundedQueue<String> queue = new UnboundedQueue<>();
		queue.enq("Hello");
		queue.enq("my");
		queue.enq("name");
		queue.enq("is");
		queue.enq("Stephen");
		System.out.println("Count is: " + queue.getSize());
		queue.deq();
		System.out.println("Dequeing...");
		System.out.println("Count is: " + queue.getSize());
		queue.enq("How");
		queue.enq("are");
		queue.enq("you");
		System.out.println("Count is: " + queue.getSize());
		queue.deq();
		System.out.println("Dequeing...");
		System.out.println("Count is: " + queue.getSize());
		queue.print();
	}
}