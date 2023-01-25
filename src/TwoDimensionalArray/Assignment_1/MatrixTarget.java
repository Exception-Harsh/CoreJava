package TwoDimensionalArray.Assignment_1;
import TwoDimensionalArray.MatrixMethods;
import java.util.Scanner;

public class MatrixTarget {
    public static void indices(int[][] mat, int target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == target)
                    System.out.println("Target is at row " + i + " column " + j);
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter row and column: ");
        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] matrix = new int[row][col];
        MatrixMethods.inputInt2DArray(matrix);

        System.out.print("Enter element to be searched: ");
        int target = scan.nextInt();
        indices(matrix, target);
    }
}
