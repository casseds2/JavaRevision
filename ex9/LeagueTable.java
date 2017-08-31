import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

class LeagueTable{
	public static void main(String [] args){

		TreeMap<String, String> table = new TreeMap<>();
		Scanner in = new Scanner(System.in);
		String key = "";
		String value = "";
		while((key = in.next()) != null && !key.equals("0")){
			if((value = in.next()) != null)
				table.put(key, value);
		}
		for(Map.Entry<String, String> e : table.entrySet()){
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}