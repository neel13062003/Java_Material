import java.lang.Integer;
import java.util.Scanner;

abstract class generic_matrix {
    private Object matrix[][];

    public generic_matrix(Object matrix[][]) {
        this.matrix = matrix;
    }

    public Object[][] addmatrix(Object matrix[][]) {
        Object result[][] = new Object[matrix.length][matrix[0].length];
        if ((this.matrix.length != matrix.length) || (this.matrix[0].length != matrix[0].length)) {
            System.out.println("Matrixs are not same size.......");
            System.exit(0);
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = add(this.matrix[i][j], matrix[i][j]);
            }
        }
        return result;
    }

    public Object[][] multiplymatrix(Object matrix[][]) {
        Object result[][] = new Object[this.matrix.length][matrix[0].length];
        if (this.matrix[0].length != matrix.length) {
            System.out.println("Bound Error........");
            System.exit(0);
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();
                for (int k = 0; k < this.matrix[0].length; k++) {
                    result[i][j] = add(result[i][j], multiply(this.matrix[i][k], matrix[k][j]));
                }
            }
        }
        return result;
    }

    public abstract Object add(Object o1, Object o2);

    public abstract Object multiply(Object o1, Object O2);

    public abstract Object zero();
}

class IntegerMatrix extends generic_matrix {
    public IntegerMatrix(Integer[][] m) {
        super(m);
    }

    public Object add(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return new Integer(i1.intValue() + i2.intValue());
    }

    public Object multiply(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return new Integer(i1.intValue() * i2.intValue());
    }

    public Object zero() {
        return new Integer(0);
    }
}

public class exp4_1 {
    public static void main(String args[]) {
        int m, n, o, p;

        Integer[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Integer[][] m2 = { { 1, 3, 5 }, { 2, 4, 6 }, { 3, 5, 7 } };
        Scanner s = new Scanner(System.in);

        IntegerMatrix im1 = new IntegerMatrix(m1);
        Object m3[][] = im1.addmatrix(m2);
        Object m4[][] = im1.multiplymatrix(m2);
        System.out.println("Addition : ");
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[0].length; j++) {
                System.out.print((Integer) m3[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Mutiplication : ");
        System.out.println();
        for (int i = 0; i < m4.length; i++) {
            for (int j = 0; j < m4[0].length; j++) {
                System.out.print((Integer) m4[i][j] + " ");

            }
            System.out.println();
        }
    }
}
