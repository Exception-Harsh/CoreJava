package DsaAlgorithms;

/*Question: Sort the given array of the name of fruits in lexicographical order using selection sort
Array: {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"}
Ans: {"apple", "kiwi", "lime", "mango", "papaya", "watermelon"}   */

public class Problem2 {

    public static void sortFruits(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_index]) < 0)
                    min_index = j;
            }
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        System.out.print("Array: ");
        for (String f : fruits) {
            System.out.print(f + " ");
        }
        System.out.println();

        sortFruits(fruits);
        System.out.println("Array after sorting lexicographically: ");
        for (String f: fruits) {
            System.out.print(f + " ");
        }
    }
}
