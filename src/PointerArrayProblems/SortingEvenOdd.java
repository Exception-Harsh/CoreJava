package PointerArrayProblems;
import ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class SortingEvenOdd {

    public static void sortEvenAndOdd(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (array[left] % 2 == 1 && array[right] % 2 == 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
            if (array[left] % 2 == 0) {left++;}
            if (array[right] % 2 == 1) {right--;}
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
