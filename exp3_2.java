import java.util.Scanner;

public class exp3_2 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter row1 : ");
		int row1 = input.nextInt();
		System.out.println("Enter col1 : ");
		int col1 = input.nextInt();

		int[][] m1 = get2DArr(row1, col1);
		System.out.println("Matrix : 1");
		print2DArr(m1);

		System.out.println("Enter row2 : ");
		int row2 = input.nextInt();
		System.out.println("Enter col2 : ");
		int col2 = input.nextInt();

		int[][] m2 = get2DArr(row2, col2);
		System.out.println("Matrix : 2");
		print2DArr(m2);

		if (row1 != row2 || col1 != col2) {
			System.out.println("Addition is not possible. Enter Valid Size.");
		} else {
			System.out.println("Addition of 2D array : ");
			int[][] add2DArr = add2DArr(m1, m2);
			print2DArr(add2DArr);
		}

		if (col1 != row2) {
			System.out.println("Multiplication is not possible. Enter Valid Size.");
			System.exit(0);
		} else {
			System.out.println("Multiplication of 2D array : ");
			int[][] mul2DArr = mul2DArr(m1, m2);
			print2DArr(mul2DArr);
		}
	}

	public static int[][] get2DArr(int row, int col) {
		Scanner input = new Scanner(System.in);
		int[][] a = new int[row][col];

		System.out.println("Enter " + (row * col) + " elements one by one : ");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				a[i][j] = input.nextInt();

		return a;
	}

	public static int[][] add2DArr(int[][] a1, int[][] a2) {

		int row = a1.length;
		int col = a1[0].length;

		int[][] add = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				add[i][j] = a1[i][j] + a2[i][j];

		return add;
	}

	public static int[][] mul2DArr(int[][] a1, int[][] a2) {

		int row1 = a1.length;
		int col1 = a1[0].length;
		int col2 = a2[0].length;

		int[][] mul = new int[row1][col2];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				mul[i][j] = 0;
				for (int k = 0; k < col2; k++) {
					mul[i][j] += a1[i][k] * a2[k][j];
				}
			}
		}

		return mul;
	}

	public static void print2DArr(int[][] a) {
		int row = a.length;

		for (int i = 0; i < row; i++) {
			int col = a[i].length;
			for (int j = 0; j < col; j++)
				System.out.printf(a[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
};