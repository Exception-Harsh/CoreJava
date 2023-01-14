package PointerArrayProblems;
import ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class Sorting_1 {

    public static void sortZerosAndOnes(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i++] = 0;
                arr[j--] = 1;
            }
            if (arr[i] == 0) {i++;}
            if (arr[j] == 1) {j--;}
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = scan.nextInt();
        int[] array1 = new int[size];

        ArrayConcepts.inputIntArray(array1);
        ArrayConcepts.printIntArray(array1);

        System.out.println("Array after sorting: ");
        sortZerosAndOnes(array1);
        ArrayConcepts.printIntArray(array1);
    }
}
