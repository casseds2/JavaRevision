import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

class FreqCounter{
	public static void main(String [] args){

		TreeMap<Integer,Integer> counter = new TreeMap<>();
		Scanner in = new Scanner(System.in);
		String word = ""; //Word of lenght n
		while((word = in.next()) != null && !word.equals("0")){
			int length = word.length();
			if(counter.containsKey(length)){
				counter.put(length, counter.get(length) + 1);
			}
			else
				counter.put(length, 1);
		}
		System.out.println("Word length     Word Freq" );
		for(Map.Entry<Integer, Integer> e : counter.entrySet()){
			System.out.println("     " + e.getKey() + "               " + e.getValue());
		}
	}
}