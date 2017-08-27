class SortNames {

	static <T extends Comparable<T>> void sort(T [] s) {
		for (int i = 0; i<s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if (s[i].compareTo(s[j])>0) {
					T t;
					t = s[i]; 
					s[i] = s[j]; 
					s[j] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] names = {"Pete","Jill","May","Anne","Tim"};             
		sort(names);
		for (String s:names) 
			System.out.println(s);
	}
}
