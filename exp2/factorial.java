

class factorial {
    static int Factorial(int n) {
        int fact = 1;
        if (n <= 1) {
            return 1;
        } else {
            // return Factorial(n * Factorial(n - 1));
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        int n, fact = 1;
        n = Integer.parseInt(args[0]);
        fact = Factorial(n);

        System.out.println("Factorial of the " + n + " is " + fact);
    }
}