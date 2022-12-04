import java.util.Scanner;

class mul_of_matrix {
  

    static void multi(int[][] p, int x, int y, int[][] q, int s, int t) {
        int[][] r = new int[x][t];
        if (y != s) {
            System.out.println("These matrices cannot be multiplies.");
        } else {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < t; j++) {
                    r[i][j] = 0;
                    for (int k = 0; k < s; k++) {
                        r[i][j] = r[i][j] + p[i][k] * q[k][j];
                    }
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(r[i][j] + "        ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oper;

                int x, y;
                System.out.print("Enter the number of row and column of Array 1 seperated by space : ");
                x = sc.nextInt();
                y = sc.nextInt();
                int[][] p = new int[x][y];
                System.out.println("Enter the members of array 1 row wise : ");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        p[i][j] = sc.nextInt();
                    }
                }
                int s, t;
                System.out.print("Enter the number of row and column of Array 2 seperated by space : ");
                s = sc.nextInt();
                t = sc.nextInt();
                int[][] q = new int[s][t];
                System.out.println("Enter the members of array 2  row wise : ");
                for (int i = 0; i < s; i++) {
                    for (int j = 0; j < t; j++) {
                        q[i][j] = sc.nextInt();
                    }
                }
                System.out.println("ARRAY : 1");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        System.out.print(p[i][j] + "        ");
                    }
                    System.out.println();
                }
                System.out.println("ARRAY : 2");
                for (int i = 0; i < s; i++) {
                    for (int j = 0; j < t; j++) {
                        System.out.print(q[i][j] + "        ");
                    }
                    System.out.println();
                }
                System.out.println("Multiplication of the array ");
                multi(p, x, y, q, s, t);
                

           
        }

    }
