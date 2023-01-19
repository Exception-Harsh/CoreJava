package PrefixProblems;
import ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class ArrayPartitioning {

    public static int arraySum(int[] arr) {
        int total_sum = 0;
        for (int i : arr) {
            total_sum += i;
        }
        return total_sum;
    }

    public static boolean equalSumPartition(int[] arr) {
        int total_sum = arraySum(arr);
        int prefix_sum = 0;
        for (int j : arr) {
            prefix_sum += j;
            int suffix_sum = total_sum - prefix_sum;

            if (suffix_sum == prefix_sum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        ArrayConcepts.inputIntArray(array);
        System.out.println("Equal Partition Possible " + equalSumPartition(array));
    }
}
