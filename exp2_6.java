import java.util.Scanner;

public class exp2_6{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		long n =input.nextLong();
		
		long nth_Fibo = getnTH_Fibo(n);

		System.out.println();
		System.out.println(n+"th fibonacci number : "+nth_Fibo);
	}
	
	public static long getnTH_Fibo(long n){
		long a = 0;
		System.out.print(a+" ");
		if(n==1) return a;
		
		long b = 1;
		System.out.print(b+" ");
		if(n==2) return b;
		
		long c=-1;
		for(int i=0; i<n-2; i++){
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
		System.out.println();
		return c;
	}
};