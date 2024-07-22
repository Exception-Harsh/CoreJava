package DsaAlgorithms.SelectionSorting;

import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // i represent the current index of the array
            //Used to find the min element in the unsorted array
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) { // j represents the unsorted part of the array
                if (arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        ArrayConcepts.inputIntArray(array);

        selectionSort(array);
        ArrayConcepts.printIntArray(array);
    }
}
