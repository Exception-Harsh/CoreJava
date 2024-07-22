package DsaAlgorithms;

import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.Scanner;
//Question: Sort the zeros in the array to the end of the array without changing the order of the non-zero elements

public class Problem1 {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
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
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        ArrayConcepts.inputIntArray(arr);

        System.out.println("After putting all the zeros in the array on end of array without changing the sequence of the non-zero elements: ");
        bubbleSort(arr);
        ArrayConcepts.printIntArray(arr);
    }
}
