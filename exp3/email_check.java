import java.util.Scanner;

class email_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String email;
        boolean valid;
        System.out.print("Enter the email address : ");
        email = sc.nextLine();
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                count++;
            }
        }
        // valid = email.contains("@") && email.contains(".com");
        if (count == 1) {
            System.out.println("It is valid address.");
            String[] r = email.split("@");
            System.out.println("Email Id : " + r[0]);
            System.out.println("Email Server Address : " + r[1]);
        } else {
            System.out.println("You have entered wrong email address.");
        }

    }
}