import java.util.Scanner;

public class exp1_3{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int res = getSOD(n);
		
		System.out.println();
		System.out.println(n+" - Sum Of Digits : "+res);
	}
	
	public static int getSOD(int n){
	
		int sum=0;
		
		while(n != 0){
			int lastD = n%10;
			n /= 10;
			
			sum += lastD;
		}
		return sum;
	}
}