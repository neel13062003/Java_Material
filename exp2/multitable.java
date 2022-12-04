import java.util.*;

class multitable {
    public static void main(String[] args) {
        int a;
        a = Integer.parseInt(args[0]);
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i * j + "      ");
            }
            System.out.println();
        }
    }
}