package CollectionsProgram.ArrayList;

import OneDimensionalArray.ArrayProblems.ArrayConcepts;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> al2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Size of Array: ");
        int size = scan.nextInt();
        int numOfZero = 0;
        int[] arr = new int[size];
        ArrayConcepts.inputIntArray(arr);

        for (int i : arr) {
            if (i != 0)
                al2.add(i);
            else
                numOfZero++;
        }
        for (int i = 0; i < numOfZero; i++) {
            al2.add(0);
        }
        System.out.println(al2);
    }
}
