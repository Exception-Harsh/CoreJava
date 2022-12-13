package ArrayProblems;

import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 8, 1};
        Arrays.sort(arr);
        int max1 = arr[0];
        int max2 = arr[0];

//        Method 1 for finding max value in arrays
        for (int i : arr) {
            if (max1 < i)
                max1 = i;
        }
        System.out.println(max1);

//        Method 1 for finding max value in arrays
        for (int j : arr) {
            if (max2 < j)
                max2 = j;
        }
        System.out.println(max2);
    }
}
