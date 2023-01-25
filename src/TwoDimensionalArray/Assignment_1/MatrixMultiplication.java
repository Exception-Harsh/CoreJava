package TwoDimensionalArray.Assignment_1;
import TwoDimensionalArray.MatrixMethods;

import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] productMatrix(int[][] arr1, int[][] arr2, int row1, int col2) {
        int[][] ans = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row1; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter row and column for 1st matrix: ");
        int row1= scan.nextInt();
        int col1 = scan.nextInt();

        System.out.print("Enter row and column for 2nd matrix: ");
        int row2 = scan.nextInt();
        int col2 = scan.nextInt();

        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        MatrixMethods.inputInt2DArray(matrix1);
        MatrixMethods.inputInt2DArray(matrix2);

        if (col1 == row2) {
            int[][] ansMatrix = productMatrix(matrix1, matrix2, row1, col2);
            MatrixMethods.printInt2DArray(ansMatrix);
        } else {
            System.out.println("Matrix multiplication cannot be performed!");
        }
    }
}
