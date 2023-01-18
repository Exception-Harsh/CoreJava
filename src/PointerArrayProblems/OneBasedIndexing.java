package PointerArrayProblems;
import java.util.Scanner;

public class OneBasedIndexing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scan.nextInt();
        int[] array = new int[size + 1];

        System.out.print("Enter elements of array: ");
        for (int i = 1; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int[] prefixSum = Prefix.makePrefixSumArray(array);

        System.out.print("Enter number of queries: ");
        int query = scan.nextInt();

        //Optimised Method
        while (query-- > 0) {
            System.out.print("Enter the values of l and r: ");
            int l = scan.nextInt();
            int r = scan.nextInt();
            int sum = prefixSum[r] - prefixSum[l - 1];
            System.out.println("Sum: " + sum);
        }

/*
            Brute Force Method
            while (query-- > 0) {
            System.out.print("Enter the values of l and r: ");
            int l = scan.nextInt();
            int r = scan.nextInt();
            int sum = 0;
            for (int i = l; i <= r; i++) {
                sum += array[i];
            }
            System.out.println("Sum = " + sum);
        }
*/
    }
}
