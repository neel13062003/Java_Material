import java.util.Scanner;

class cmd_line_calc {
    public static void main(String args[]) {
        int a, b;
        char sign = args[1].charAt(0);
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[2]);
            switch (sign) {
                case '+':
                    System.out.println("Addition of Two number is " + (a + b));
                    break;
                case '-':
                    System.out.println("Substraction  of Two number is " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication of Two number is " + (a * b));
                    break;
                case '/':
                    System.out.println("Divison of Two number is " + (a / b));
                    break;

                default:
                    break;
            }

        } else {
            System.out.println("Please entered three arguments..");
        }
    }
}