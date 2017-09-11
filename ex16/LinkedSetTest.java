class LinkedSetTest{
	public static void main(String[] args) {
		LinkedSet<Integer> nums1 = new LinkedSet<>();
		LinkedSet<Integer> nums2 = new LinkedSet<>();
		for(int i = 0; i < 10; i++){
			nums1.add(i);
		}
		for(int i = 0; i < 10; i++){
			nums2.add(i);
		}
		System.out.println("Sets containsAll(): " + nums1.containsAll(nums2));
		System.out.println("Sets equal(): " + nums1.equals(nums2));
	}
}