 import java.util.Scanner;

class merge_array {
    static void sort(int[] c, int r) {
        int i, j, key;
        for (i = 1; i < r; i++) {
            key = c[i];
            j = i - 1;
            while (j >= 0 && c[j] > key) {
                c[j + 1] = c[j];
                j = j - 1;
            }
            c[j + 1] = key;

        }
        System.out.print("Sorted Merge Array : ");
        for (i = 0; i < r; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter the length of Array 1 : ");
        m = sc.nextInt();
        int[] a = new int[m];
        System.out.print("Enter the elements of Array 1 : ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the length of Array 2 : ");
        n = sc.nextInt();
        int[] b = new int[n];
        System.out.print("Enter the elements of Array 2 : ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int r = m + n;
        int[] c = new int[r];
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[m + i] = b[i];
        }
        System.out.print("Merged Array : ");
        for (int i = 0; i < r; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        sort(c, r);

    }
}