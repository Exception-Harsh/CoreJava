package DsaAlgorithms.SelectionSorting;

import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class SelectionSort {
    public static void ascSelectionSort(int[] arr) {
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

    public static void descSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // i represent the current index of the array
            //Used to find the max element in the unsorted array
            int max_index = i;
            for (int j = i + 1; j < arr.length; j++) { // j represents the unsorted part of the array
                if (arr[j] > arr[max_index])
                    max_index = j;
            }
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        ArrayConcepts.inputIntArray(array);

//        selectionSort(array);
//        ArrayConcepts.printIntArray(array);

        descSelectionSort(array);
        ArrayConcepts.printIntArray(array);
    }
}
