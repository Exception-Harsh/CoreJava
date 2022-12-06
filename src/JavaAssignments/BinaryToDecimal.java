package JavaAssignments;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        long binNum = scan.nextLong();
        long temp = binNum;
        int decNum = 0, count = 0, i = 0;

        while (temp != 0) {
            long remainder = temp % 10;
            count++;
            temp /= 10;
            decNum += remainder * Math.pow(2, i++);
        }
        System.out.println("Decimal Number of " + binNum + " is " + decNum);
    }
}
