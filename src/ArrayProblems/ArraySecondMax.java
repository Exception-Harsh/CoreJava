package ArrayProblems;
import java.util.Arrays;
public class ArraySecondMax {
    public static void main(String[] args) {
        int[] array = {121, 445, 110, 94, 297, 300};
        Arrays.sort(array);
        ArrayConcepts.printIntArray(array);

        int index = array.length - 1;

        while (array[index] == array[array.length - 1])
            index--;

        System.out.println("Second Largest Number: " + array[index]);
    }
}
