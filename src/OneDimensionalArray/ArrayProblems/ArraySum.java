package OneDimensionalArray.ArrayProblems;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum of the elements in array: " + sum);
    }
}