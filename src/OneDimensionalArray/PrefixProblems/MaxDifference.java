package OneDimensionalArray.PrefixProblems;
import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class MaxDifference {

    public static int[] makePrefixArray(int[] arr) {
        int[] prefixArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        prefixArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArray[i] = arr[i] + prefixArray[i - 1];
        }
        return prefixArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size and m: ");
        int size = scan.nextInt();
        int m = scan.nextInt();

        int[] array = new int[size];
        ArrayConcepts.inputIntArray(array);
        int[] ans = makePrefixArray(array);

        int diff = ans[ans.length - 1] - ans[m - 1];
        int maxDiff = diff - ans[m - 1];
        System.out.println("Maximum Difference = " + maxDiff);
    }
}
