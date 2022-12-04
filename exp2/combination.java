import java.io.*;
import java.util.*;

public class combination {
    public void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void part(int[] a, int k) {
        if (k == a.length)
            display(a);
        else

            for (int i = k; i < a.length; i++) {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                part(a, k + 1);
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
    }

    public static void main(String[] args) {
        combination p = new combination();
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        p.part(a, 0);
    }

}