package OneDimensionalArray.PrefixProblems;
import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.Scanner;

public class MaxAltitudeGain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scan.nextInt();
        int[] gain = new int[n];
        ArrayConcepts.inputIntArray(gain);

        int[] altitude = new int[n + 1];
        altitude[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            altitude[i] = altitude[i - 1] + gain[i - 1];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n + 1; i++) {
            max = Math.max(max, altitude[i]);
        }
        System.out.println("The maximum altitude: " + max);
    }
}
