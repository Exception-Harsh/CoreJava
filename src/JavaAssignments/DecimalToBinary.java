package JavaAssignments;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int binNum = 0, i = 1;

        System.out.print("Enter the Decimal Number: ");
        int decNum = scan.nextInt();
        scan.close();
        int temp = decNum;

        while (temp != 0) {
            int remainder = temp % 2;
            temp /= 2;
            binNum += remainder * i;
            i *= 10;
        }
        System.out.println("Binary Number of " + decNum + " is " + binNum);
    }
}
