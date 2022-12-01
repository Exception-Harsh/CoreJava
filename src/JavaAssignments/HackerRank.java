package JavaAssignments;

import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int s = 0;
            s += a;
            for (int j = 0; j <= n; j++) {
                if (j < n) {
                    s += (int) (Math.pow(2, j) * b);
                    System.out.print(s + " ");
                }
            }
            System.out.println();
        }
    }
}
