package OneDimensionalArray.ArrayProblems;
import java.util.Scanner;
public class ArrayRotate {

    public static int[] rotateArray(int[] arr, int k) {
        k %= arr.length;
        int[] ans = new int[arr.length];
        int j = 0;

        for (int i = arr.length - k; i < arr.length; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < arr.length - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of Array and steps for Rotation: ");
        int size = scan.nextInt();
        int step = scan.nextInt();

        int[] array = new int[size];
        ArrayConcepts.inputIntArray(array);
        ArrayConcepts.printIntArray(array);

        int[] newArray = rotateArray(array, step);
        ArrayConcepts.printIntArray(newArray);
    }
}
