import java.io.*;
import java.util.*;

class Directory{
	public static void main(String [] args){
		HashMap<String, String> directory = new HashMap<>();
		Scanner in = new Scanner(System.in);
		String value = "";
		String key = "";
		while((key = in.next()) != null){
			if(directory.containsKey(key)){
				if((value = in.next()) != null && !value.equals("?")){
					directory.put(key, value);
				}
				else{
					System.out.println(key + " : " + directory.get(key));
				}
			}
			else{
				if((value = in.next()) != null && value.equals("?"))
					System.out.println("Cant find " + key);
				else
					directory.put(key, value);
			}
		}
	}
}