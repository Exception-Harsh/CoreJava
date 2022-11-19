package JavaAssignments;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
            else {
                sum2 += i;
            }
        }
        int finalsum = sum2 - sum1;
        System.out.println(finalsum);
    }
}