package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
