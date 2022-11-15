import java.util.Scanner;

public class exp3_3{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Email-Address : ");
		String email = input.nextLine();
		
		if(isValid(email)){
			String email_id = new String();
			String server_add = new String();
			
			int i=0;
			while(email.charAt(i) != '@')
				email_id += email.charAt(i++);
			
			i++;
			while(i < email.length())
				server_add += email.charAt(i++);
			
			System.out.println();
			System.out.println("Status : valid Email-Address");
			System.out.println("Emial-id : " + email_id);
			System.out.println("Server-Address : " + server_add);
			
		}else{
			System.out.println();
			System.out.println("Status : Invalid Email-Address");
			System.exit(0);
		}
	}
	
	public static Boolean isValid(String email){
		
		int pos1 = -1; // for '@'
		int pos2 = -1; // for '.'
		
		for(int i=0; i<email.length(); i++){
			if(email.charAt(i) == '@') pos1 = i;
			if(email.charAt(i) == '.') pos2 = i;
		}
		
		if(pos1 == -1 || pos2 == -1) return false;
		if(pos1 > pos2) return false;
		
		return true;
	}
};