package PointerArrayProblems;
import ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class SortingSquares {

    public static int[] squareArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] sort(int[] array) {
        int[] newArray = squareArray(array);

        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] >= newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        ArrayConcepts.inputIntArray(arr);
        int[] ans = sort(arr);
        ArrayConcepts.printIntArray(ans);
    }
}
