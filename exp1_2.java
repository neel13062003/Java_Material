import java.util.Scanner;

public class exp1_2{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		long n =input.nextLong();
		
		System.out.println();
		System.out.println("Fibonacci Series for first "+n+" numbers :");
		printFibonacci(n);
	}
	
	public static void printFibonacci(long n){
		long a = 0;
		System.out.print(a+" ");
		if(n==1) return;
		
		long b = 1;
		System.out.print(b+" ");
		if(n==2) return;
		
		long c=-1;
		for(int i=0; i<n-2; i++){
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
		System.out.println();
	}
};