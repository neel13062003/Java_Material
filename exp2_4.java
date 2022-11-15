public class exp2_4{
	public static void main(String[] arg){
		System.out.printf("\t"); //8-digits space handle
		
		for(int i=1; i<=10; i++) System.out.printf("%4d", i);
		System.out.println();
		for(int i=1; i<=25; i++) System.out.print("- ");
		System.out.println();
		
		for(int i=1; i<=10; i++){
			System.out.printf("%4d  | ",i); //8-digits space handle
			for(int j=1; j<=10; j++){
				System.out.printf("%4d",i*j);
			}
			System.out.println();
		}
	}
};