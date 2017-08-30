import java.util.Collections;
import java.util.ArrayList;

class Miracle{
	public static void main(String [] args){

		//Populate the array with [1..10]
		ArrayList<Integer> allNums = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			allNums.add(i);
		}
		//Make into one big number
		//Proceed to divide it to knock bits off the right hand side
		boolean miracleFound = false;
		String tempNum;
		long miracleNum = 0;
		while(!miracleFound){
			//Make A String from the List And analyse it
			tempNum = "";
			for(int i = 0; i < allNums.size(); i++){
				tempNum = tempNum + allNums.get(i);
				//System.out.println("Tempnum is " + tempNum + " and i is " + i);
				if(i > 0){
					miracleNum = Long.valueOf(tempNum).longValue();
					if(miracleNum % (i+1) == 0){ //If it is divisible without remainders
						if((i+1) == 10){
							miracleFound = true;
							System.out.println("Number " + miracleNum + " was a miracle number.");
						}
						else{
							System.out.println(miracleNum + " % " + (i+1) + " is 0.");
						}
					}
					else{
						Collections.shuffle(allNums);
						i = allNums.size();
						System.out.println("Number " + miracleNum + " was not a miracle number.");
					}
				}
			}
		}
	}
}