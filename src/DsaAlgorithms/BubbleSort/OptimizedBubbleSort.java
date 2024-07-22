package DsaAlgorithms.BubbleSort;

import java.util.Scanner;
import OneDimensionalArray.ArrayProblems.ArrayConcepts;

public class OptimizedBubbleSort {
    public static void optimizedAscBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            } if (!flag)
                break;
        }
    }

    public static void optimizedDescBubbleSort(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            } if (!flag)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        ArrayConcepts.inputIntArray(array);

        //Sorting using bubble sort
        optimizedAscBubbleSort(array);
        ArrayConcepts.printIntArray(array);

/*
        optimizedDescBubbleSort(array);
        ArrayConcepts.printIntArray(array);
*/
    }
}
