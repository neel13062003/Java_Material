import java.util.Scanner;

public class exp1_1{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println("Pattern : 1\n");
		for(int i=1; i<=n; i++) pattern1(i, "* ", n);
		
		
		System.out.println("\nPattern : 2\n");
		for(int i=1; i<n; i++) pattern2(i, "* ", n);  // i<n
		for(int i=1; i<=n; i++) pattern1(i, "* ", n); // like subproblem		
		
		System.out.println("\nPattern : 3\n");
		for(int i=1; i<=n; i++) pattern3(i, "*", n); // only change star : "*" in pattern1
		
		System.out.println("\nPattern : 4\n");
		for(int i=1; i<n; i++) pattern4(i, "*", n);	 // i<n
		for(int i=1; i<=n; i++) pattern3(i, "*", n); // like subproblem
	}
	
	public static void pattern1(int i, String star, int n){
		
		for(int j = 1; j<=i-1; j++) System.out.print(" ");
		for(int j = n; j>=i; j--) System.out.print(star);
		
		System.out.println();
	}
	
	public static void pattern2(int i, String star, int n){
		
		for(int j = i; j<=n-1; j++) System.out.print(" ");
		for(int j = 1; j<=i; j++) System.out.print(star);
		
		System.out.println();
	}
	
	public static void pattern3(int i, String star, int n){
		
		for(int j = 1; j<=i-1; j++) System.out.print(" ");
		for(int j = n; j>=i; j--) System.out.print(star);
		
		System.out.println();
	}	
	
	public static void pattern4(int i, String star, int n){
		
		for(int j = n-1; j>=i; j--) System.out.print(" ");
		for(int j = 1; j<=i; j++) System.out.print(star);
		
		System.out.println();
	}
};