public class exp2_1{
	public static void main(String[] arg){
		if(arg.length != 3) {
			System.out.println("Enter Only 3 Arguments in following given order.\noperand1, operator, operand2 respectively.\n");
			return; // System.exit(0);
		}
		
		int n1 = Integer.parseInt(arg[0]);
		int n2 = Integer.parseInt(arg[2]);
		double res=0;
		
		if(arg[1].equals("+")) res = n1+n2;
		else if(arg[1].equals("-")) res = n1-n2;
		else if(arg[1].equals("@")) res = n1*n2;
		else if(arg[1].equals("/")) res = (double)n1/n2;
		else System.out.println("Entered Operator is not found. ");
		
		System.out.println("Answer : "+res);
	}
};