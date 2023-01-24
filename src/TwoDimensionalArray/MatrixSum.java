package TwoDimensionalArray;
import java.util.Scanner;

public class MatrixSum {
    public static int[][] matrixSum(int[][] arr1, int[][] arr2, int row, int col) {
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter row and column for two matrices: ");
        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] array_1 = new int[row][col];
        int[][] array_2 = new int[row][col];
        MatrixMethods.inputInt2DArray(array_1);
        MatrixMethods.inputInt2DArray(array_2);
        MatrixMethods.printInt2DArray(array_1);
        MatrixMethods.printInt2DArray(array_2);

        int[][] sumArray = matrixSum(array_1, array_2, row, col);
        System.out.println("New Matrix after sum: ");
        MatrixMethods.printInt2DArray(sumArray);
    }
}
