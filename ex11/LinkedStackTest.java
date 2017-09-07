class LinkedStackTest{
	public static void main(String[] args) {
		LinkedStack<Integer> nums = new LinkedStack<>();
		nums.push(1);
		nums.push(2);
		nums.push(3);
		System.out.println(nums.size());
		nums.pop();
		System.out.println(nums.size());
	}
}