import java.util.Scanner;

class Fibonacci{
	public static void main(String[] args) {
		//System.out.println(fib(6));
		try{
			Scanner in =  new Scanner(System.in);
			System.out.print("What would you like the Fibonacci of? ");
			int num = in.nextInt();
			in.close();
			System.out.println("Fibonacci(" + num + ") is " + fib(num));
		}
		catch(Exception e){
			System.out.println("Error: " + e);
		}
	}

	private static int fib(int i){
		if(i <= 1)
			return i;
		return fib(i - 2) + fib(i - 1);
	}
}