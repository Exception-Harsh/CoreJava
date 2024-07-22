package DsaAlgorithms.BubbleSort;

import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.*;

public class BubbleSort {
    /*The reason for i < arr.length - 1 is because we don't need to iterate the n(array size) times, as the sorting can be done in n - 1 iterations. */

    public static void ascBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void descBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of int array: ");
        int size = scan.nextInt();

        int[] array1 = new int[size];
        ArrayConcepts.inputIntArray(array1);

        //after ascending bubble sort
        ascBubbleSort(array1);
        System.out.print("Elements after sorted in ascending order: ");
        ArrayConcepts.printIntArray(array1);

        //after descending bubble sort
        descBubbleSort(array1);
        System.out.print("Elements after sorted in descending order: ");
        ArrayConcepts.printIntArray(array1);
    }
}

/* In bubble sort algorithm, in each iteration the largest number in the array is placed in its right position according to ascending or descending order*/
//number of swaps in worst case scenario is (n(n - 1))/ 2