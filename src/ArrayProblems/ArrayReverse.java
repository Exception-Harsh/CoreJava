package ArrayProblems;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        int[] revarray = new int[size];
        int j = 0;

        ArrayConcepts.inputIntArray(array);

        for (int i = array.length - 1; i >= 0; i--) {
           revarray[j++] = array[i];
        }
        ArrayConcepts.printIntArray(revarray);
    }
}
