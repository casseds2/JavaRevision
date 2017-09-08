class LinkedQueueTest{
	public static void main(String[] args) {
		LinkedQueue<Integer> nums = new LinkedQueue<>();
		for(int i = 0; i < 10; i++){
			nums.enq(i);
		}
		nums.put();
		System.out.println("Dequeued: " + nums.deq());
		nums.put();
		System.out.println("Dequeued: " + nums.deq());
		nums.put();
		nums.enq(5);
		System.out.println("Enqueued: 5");
		nums.put();
	}
}