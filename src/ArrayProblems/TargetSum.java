package ArrayProblems;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1 = {4, 6, 3, 5, 8, 2};
        int pair = 0;

        System.out.print("Enter target for the summation: ");
        int target = scan.nextInt();

        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] + array1[j] == target)
                    pair++;
            }
        }
        System.out.println("No. of pairs in array whose sum is " + target + " are " + pair);
    }
}
