import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class OddsEvens{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> odds = new ArrayList<>();
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> allNums = new ArrayList<>();
		int count = 0;
		int j;
		while(count < 6){
			j = in.nextInt();
			if(j % 2 == 0){
				evens.add(j);
				allNums.add(j);
			}
			else{
				odds.add(j);
				allNums.add(j);
			}
			count++;
		}
		System.out.print("Odds: ");
		for(Integer i : odds){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Evens: ");
		for(Integer i : evens){
			System.out.print(i + " ");
		}
		System.out.println();
		// System.out.print("Sorted: " + sort(allNums));
		Collections.sort(allNums);
		System.out.print("Sorted: " + allNums);
	}

	private static ArrayList<Integer> sort(ArrayList<Integer> arr){
		//System.out.println(arr);
		for(int i = 0; i < arr.size() - 1; i++){
			if(arr.get(i) > arr.get(i + 1)){
				int temp = arr.get(i);
				arr.set(i, arr.get(i + 1));
				arr.set(i + 1, temp);
				i = -1;
				//System.out.println(arr);
			}
		}
		return arr;
	}
}