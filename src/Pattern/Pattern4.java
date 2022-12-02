package Pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
