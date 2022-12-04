import java.util.Scanner;

public class ptrn
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		
		for(int i=n; i>=1; i--)
		{
			for (int j=i; j>=1;j--)
			{
				
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
}