package ArrayProblems;
import java.util.Scanner;

public class ArrayFrequency {

    static int[] makeFrequencyArray(int[] array) {
        int[] frequencyArray = new int[100001];
        for (int i : array) {
            frequencyArray[i]++;
        }
        return frequencyArray;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int[] freq = makeFrequencyArray(array);
        System.out.print("Enter no. of queries: ");
        int query = scan.nextInt();

        while (query > 0) {
            System.out.print("Enter the element to be searched: ");
            int target = scan.nextInt();

            if (freq[target] > 0)
                System.out.println("Number is present in Array.");
            else
                System.out.println("Number is not present in Array.");

            query--;
        }
    }
}
