import java.util.Scanner;

class pattern 
{

  public static void pyr(int n) 
  {
    for (int i = n; i >= 0; i--) 
	{
      for (int k = 0; k < (n - i); k++) 
	  {
        System.out.print(" ");
      }
      printData(i);
      System.out.println("");
    }
  }

  public static void doubleSidePyr(int n) 
  {
    int space = n - 1, i, j, k;
    for (j = 1; j <= n; j++) 
	{
      for (i = 1; i <= space; i++) 
	  {
        System.out.print(" ");
      }
      space--;
      printData(2 * j - 1);
      System.out.println("");
    }
    space = 1;
    for (j = 1; j <= n - 1; j++) 
	{
      for (i = 1; i <= space; i++) 
	  {
        System.out.print(" ");
      }
      space++;
      printData(2 * (n - j) - 1);
      System.out.println("");
    }
  }

  public static void rightpyr(int n) 
  {
    int i, j;
    for (int k = n; k >= 0; k--) 
	{
      for (i = k; i <= n; i++) 
	  {
        System.out.print(" ");
      }
      printData(k);

      System.out.println();
    }
  }

  // pattern 4
  public static void rightDoublePry(int n) 
  {
    for (int i = 1; i <= n; i++) 
	{
      for (int j = i; j < n; j++) 
	  {
        System.out.print(" ");
      }
      printData(i);
      System.out.println("");
    }
    for (int i = n; i >= 1; i--) 
	{
      for (int j = i; j <= n; j++) 
	  {
        System.out.print(" ");
      }
      printData(i - 1);
      System.out.println("");
    }
  }

  // printing for loop
  public static void printData(int n) 
  {
    for (int k = 1; k <= n; k++) 
	{
      System.out.print("*");
    }
  }

  // main fun
  public static void main(String ar[]) 
  {
    Scanner sc = new Scanner(System.in);
	System.out.print(" Enter the value of n : ");
    int n = sc.nextInt();
    pyr(n);
    System.out.println("");
    doubleSidePyr(n);
    System.out.println("");
    rightpyr(n);
    System.out.println("");
    rightDoublePry(n);
  }
}