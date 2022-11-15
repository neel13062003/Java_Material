import java.util.Scanner;

public class exp2_2{
	public static void main(String[] arg){
		Scanner input =  new Scanner(System.in);
		
		String operator;
		do{
			System.out.println("For Addition enter : +");
			System.out.println("For Substraction enter : -");
			System.out.println("For Multiplication enter : @");
			System.out.println("For Division enter : /");
			System.out.println();
			
			System.out.print("Enter 1st Operand : ");
			int n1 = input.nextInt();
			
			System.out.print("Enter 2nd Operand : ");
			int n2 = input.nextInt();
			
			System.out.print("Enter Appropriate Operator : ");
			operator = input.next();
			
			double res = 0;
			if(operator.equals("+")) res = n1+n2;
			else if(operator.equals("-")) res = n1-n2;
			else if(operator.equals("@")) res = n1*n2;
			else if(operator.equals("/")) res = (double)n1/n2;
			else System.out.println("Entered Operator is not found. ");
			
			System.out.println("Answer : "+res);
			
			System.out.println();
			System.out.print("Continue Calculation ? ...\nIf yes press 'q' otherwise press any key :: ");
			
			operator = input.next();
		}while(!operator.equals("q"));
	}
};