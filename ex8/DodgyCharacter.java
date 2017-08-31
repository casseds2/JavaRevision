import java.util.Scanner;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;

class DodgyCharacter{
	public static void main(String [] args){
		HashSet<String> unemploy = new HashSet<>();
		Scanner unemployed = null;
		Scanner taxpayer = null;
		try {
			unemployed = new Scanner(new File("unemployed.txt"));
			taxpayer = new Scanner(new File("taxpayer.txt"));
			while(unemployed.hasNextLine()){
				String line = unemployed.nextLine();
				unemploy.add(line);
			}
			while(taxpayer.hasNextLine()){
				String line = taxpayer.nextLine();
				if(!unemploy.add(line)){
					System.out.println(line + " is a dodgy character.");
				}
			}
		} 
		catch(FileNotFoundException e){
			System.out.println(e);
		}
	}	
}