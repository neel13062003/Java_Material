import java.util.Scanner;

public class exp2_3{
	public static void  main(String[] arg){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Duplication alllowed press\n2.Duplication is not allowed");
		System.out.print("Chosee 1 OR. 2 : ");
		
		int n = input.nextInt();
		
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				for(int k=1; k<=4; k++){
					for(int l=1; l<=4; l++){
						if(n == 1){
							System.out.print(i+""+j+""+k+""+l+" ");
							
						}else if(n==2){
							if(i!=j && i!=k && i!=l && j!=k && j!= l && k!=l)
								System.out.print(i+""+j+""+k+""+l+" ");
						}else {
							System.out.println("Choose Appropriate Option");
							System.exit(0);
						}
					}
				}
			}
			System.out.println();
			System.out.println();
		}
	}
};