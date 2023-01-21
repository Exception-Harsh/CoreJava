package OneDimensionalArray.ArrayProblems;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] JagArr = new int[3][];

        for (int i = 0; i < JagArr.length; i++) {
            JagArr[i] = new int[i + 1];
        }

        System.out.print("Enter Elements in Jagged Array: ");
        for (int i = 0; i < JagArr.length; i++) {
            for (int j = 0; j < JagArr[i].length; j++) {
                JagArr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Elements in Jagged Array: ");
        for (int[] intI : JagArr) {
            for (int intJ : intI) {
                System.out.print(intJ + " ");
            }
            System.out.println();
        }

    }
}
