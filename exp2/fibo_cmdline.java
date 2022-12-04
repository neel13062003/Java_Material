class fibo_cmdline {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = 0, b = 1, c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}