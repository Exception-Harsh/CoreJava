package OneDimensionalArray.ArrayProblems;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 9};
        int count = 0;
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the element to be searched: ");
        Scanner scan = new Scanner(System.in);
        int findNum = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (findNum == arr[i]) {
                System.out.println("Element found at " + i + " index value");
                count++;
            }
        }
        if (count == 0)
            System.out.println("-1");

    }
}
