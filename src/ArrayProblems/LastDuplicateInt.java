package ArrayProblems;

public class LastDuplicateInt {
    public static int lastDuplicate(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp = arr[i];
                    break;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array = new int[8];
        ArrayConcepts.inputIntArray(array);
        ArrayConcepts.printIntArray(array);

        System.out.println("The Last Duplicate Element: " + lastDuplicate(array));
    }
}
