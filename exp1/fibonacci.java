import java.util.Scanner;
class fibonacci {
  
  public static void main(String s[])
    {
        
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
       
        Fibo(n);
    }

    
    static void Fibo(int n)
    {
        int num1 = 0, num2 = 1;
  
        int counter = 0;
  
        
        while (counter < n) 
		{

            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
  
} 
    