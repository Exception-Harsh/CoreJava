package DsaAlgorithms.InsertionSorting;

import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class InsertionSort {
    public static void ascInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && (arr[j] < arr[j - 1])) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void descInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && (arr[j] > arr[j - 1])) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        ArrayConcepts.inputIntArray(array);

        descInsertionSort(array);
        System.out.print("Array after sorting: ");
        ArrayConcepts.printIntArray(array);
    }
}
