package TwoDimensionalArray;
import java.util.Scanner;

public class MatrixMethods {
    static Scanner scan = new Scanner(System.in);
    public static void inputInt2DArray(int[][] array) {
        System.out.print("Enter Array Data: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
        }
    }

    public static void printInt2DArray(int[][] array) {
        System.out.println("Elements in Array: ");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
