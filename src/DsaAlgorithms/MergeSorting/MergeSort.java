package DsaAlgorithms.MergeSorting;

import java.util.ArrayList;
import java.util.Scanner;
import OneDimensionalArray.ArrayProblems.ArrayConcepts;

public class MergeSort {
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> Temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                Temp.add(arr[left]);
                left++;
            } else {
                Temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            Temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            Temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = Temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        ArrayConcepts.inputIntArray(arr);
        System.out.print("Before sorting: ");
        ArrayConcepts.printIntArray(arr);

        mergeSort(arr, 0, size - 1);
        System.out.print("After sorting: ");
        ArrayConcepts.printIntArray(arr);
    }
}
