package JavaAssignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int x = 1;
        while (x < 11) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int num = scan.nextInt();
            int fact = 1;

            for (int i = 1; i < num + 1; i++) {
                fact *= i;
            }
            System.out.println("Factorial of the entered number: " + fact);
            x++;
        }
    }
}