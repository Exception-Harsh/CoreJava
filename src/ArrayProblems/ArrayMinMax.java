package ArrayProblems;

import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 8, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];

//        Method for finding max value in arrays
        for (int i : arr) {
            if (max < i)
                max = i;
        }
        System.out.println("Max value in array: " + max);

//        Method for finding min value in arrays
        for (int j : arr) {
            if (min > j)
                min = j;
        }
        System.out.println("Min value in array: " + min);
    }
}
