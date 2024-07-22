package DsaAlgorithms;

import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.*;

public class BubbleSort {
    public static int[] ascBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] descBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of int array: ");
        int size = scan.nextInt();

        int[] array1 = new int[size];
        ArrayConcepts.inputIntArray(array1);
        ArrayConcepts.printIntArray(array1);

        //after ascending bubble sort
        int[] ansArray1 = ascBubbleSort(array1);
        ArrayConcepts.printIntArray(ansArray1);

        //after descending bubble sort
        int[] ansArray2 = descBubbleSort(array1);
        ArrayConcepts.printIntArray(ansArray2);
    }
}
