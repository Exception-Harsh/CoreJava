package OneDimensionalArray.ArrayProblems;
import java.util.Arrays;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] array = {18, 13, 25, 19, 34, 18, 25};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j))
                    System.out.println("Duplicate value of " + array[j] + " exists at index: " + j);
            }
        }
    }
}
