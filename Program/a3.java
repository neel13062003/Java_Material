import java.lang.Exception;

class NegativeNumberException extends Exception{
	
	NegativeNumberException(String msg){
		super(msg); // getMEssage()
	}

	//toString()
	String msg = "toString() :) Negative : ";
	public String toString(){
		return msg;
	}
}

public class a3{
	public static void main(String[] arg){
		int n = arg.length;
		if(n == 0){
			System.out.println("Enter at Least One NUmber:)");
			return;
		}	
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(arg[i]);
		
		int sum = 0;
		int tmp = -1;
		String msg = "getMessage():) Negative : ";
		
		for(int i=0; i<n; i++){
			if(arr[i] < 0){
				try{
					throw new NegativeNumberException(msg);
				}
				catch(NegativeNumberException nne){
					System.out.println(nne.getMessage() +""+ arr[i]);
					System.out.println(nne +""+ arr[i]);
				}
			}else 
				sum += arr[i];
		}
		
		System.out.println();
		System.out.println("Sum : " + sum);
	}
}