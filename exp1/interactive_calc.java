import java.util.Scanner;

class interactive_calc {
    public static void main(String[] args) {
        double a, b, c = 0;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Operands : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.print("Enter operator : ");
        s = sc.next();
        switch (s) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;

            default:
                System.out.println("Please enter a valid Operator...");
                break;
        }
        System.out.println("Result is " + c);

    }
}