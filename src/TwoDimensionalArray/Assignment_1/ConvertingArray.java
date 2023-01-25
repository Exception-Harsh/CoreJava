package TwoDimensionalArray.Assignment_1;
import TwoDimensionalArray.MatrixMethods;
import java.util.Scanner;

public class ConvertingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter m and n: ");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[m * n];

        System.out.println("Enter a elements in ascending order: ");
        for (int i = 0; i < m * n; i++) {
            arr[i] = scan.nextInt();
        }

        int k = 0;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (k == m * n - 1) {
                    matrix[i][j] = arr[k];
                } else {
                    matrix[i][j] = arr[k++];
                }
            }
        }
        MatrixMethods.printInt2DArray(matrix);
    }
}
