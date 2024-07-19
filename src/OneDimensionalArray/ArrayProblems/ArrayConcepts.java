package OneDimensionalArray.ArrayProblems;
import java.util.Scanner;

public class ArrayConcepts {
    static Scanner scan = new Scanner(System.in);
    public static void inputIntArray(int[] array) {
        System.out.print("Enter " + array.length + " elements in the Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }
    public static void printIntArray(int[] array) {
        System.out.print("Elements in the Array: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
