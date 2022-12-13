package ArrayProblems;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 9, 11};
        System.out.println("Original Array: " + Arrays.toString(array1));
        int[] array2 = new int[array1.length];

        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.println("Copied Array: " + Arrays.toString(array2));
    }
}
