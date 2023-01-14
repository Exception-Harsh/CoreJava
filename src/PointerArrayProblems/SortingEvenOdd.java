package PointerArrayProblems;
import ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class SortingEvenOdd {

    public static void sortEvenAndOdd(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] % 2 == 1 && array[j] % 2 == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            if (array[i] % 2 == 0) {i++;}
            if (array[j] % 2 == 1) {j--;}
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        ArrayConcepts.inputIntArray(array);
        System.out.println("Array after sorting: ");
        sortEvenAndOdd(array);
        ArrayConcepts.printIntArray(array);
    }
}
