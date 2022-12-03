package Pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++)
                System.out.print(j + " ");
            for (int j = 1; j < i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
