import java.util.Collections;
import java.util.ArrayList;

class Miracle{
	public static void main(String [] args){

		ArrayList<Integer> allNums = new ArrayList<>();
		for(int i = 1; i < 11; i++){
			allNums.add(i);
		}
		//Make into one big number
		//Proceed to divide it to knock bits off the right hand side
		boolean miracleFound = false;
		while(!miracleFound){
			String tempNum = "";
			long miracleNum = 0;
			for(int i = 0; i < allNums.size(); i++){
				tempNum = tempNum + allNums.get(i);
				//System.out.println(tempNum);
				miracleNum = Long.valueOf(tempNum).longValue();
				//System.out.println(miracleNum);
				if((miracleNum / (i + 1) == 0) && i > 0){
					System.out.println(tempNum + " is right so far." );
					if(i == 10)
						miracleFound = true;
				}
				else{
					Collections.shuffle(allNums);
					System.out.println(tempNum + " is not a miracle.");
					break;
				}
			}
		}
	}

}