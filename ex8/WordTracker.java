import java.util.Scanner;
import java.util.HashSet;

class WordTracker{
	public static void main(String [] args){

		HashSet<String> wordTracker = new HashSet<>();
		Scanner in = new Scanner(System.in);
		String word = ""; 
		while((word = in.next()) != null){
			if(wordTracker.add(word)){
				System.out.println();
				System.out.println(word + " was added to the set.");
			}
			else{
				System.out.println();
				System.out.println(word + " was already in the set.");
			}
		}

	}	

}