import java.util.Scanner;

public class exp1_4{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int rev = getReverse(n);
		
		System.out.println();
		System.out.println("Reverse of "+n+" : "+rev);
	}
	
	public static int getReverse(int n){
	
		int rev=0;
		
		while(n != 0){
			int lastD = n%10;
			n /= 10;
			
			rev = (rev*10) + lastD;
		}
		return rev;
	}
}