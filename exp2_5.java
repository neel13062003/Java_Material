import java.util.Scanner;

public class exp2_5{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int fact = getFactorial(n);
		
		System.out.println(n+"! = "+fact);
	}
	
	public static int getFactorial(int n){
		int fact=1;
		
		for(int i=2; i<=n; i++) fact *= i;
		return fact;
	}
};