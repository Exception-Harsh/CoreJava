package ArrayProblems;
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

    public static void main(String[] args) {
        System.out.print("Enter the size of Array: ");
        int size = scan.nextInt();
        int[] array_1 = new int[size];

        inputIntArray(array_1);
        printIntArray(array_1);

        int[] array_2;
        array_2 = array_1;
        printIntArray(array_2);
    }
}
