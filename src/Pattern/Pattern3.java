package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter rows of triangle: ");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i + 1; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
