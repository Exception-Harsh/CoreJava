package TwoDimensionalArray.Assignment_1;
import TwoDimensionalArray.MatrixMethods;
import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] matrix = new int[row][col];
        MatrixMethods.inputInt2DArray(matrix);

        int[][] rangeMatrix = new int[2][2];
        MatrixMethods.inputInt2DArray(rangeMatrix);
        int sum = 0;

        for (int i = rangeMatrix[0][0]; i <= rangeMatrix[0][1]; i++) {
            for (int j = rangeMatrix[1][0]; j <= rangeMatrix[1][1]; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
