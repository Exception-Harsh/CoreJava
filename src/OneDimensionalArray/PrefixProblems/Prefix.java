package OneDimensionalArray.PrefixProblems;
import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class Prefix {

    public static void replaceArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }
    public static int[] makePrefixSumArray(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        ArrayConcepts.inputIntArray(array);
        ArrayConcepts.printIntArray(array);

        int[] ans = makePrefixSumArray(array);
        ArrayConcepts.printIntArray(ans);
        //replacing the elements in array by its prefix sum values
        replaceArray(array);
        ArrayConcepts.printIntArray(array);
    }
}
