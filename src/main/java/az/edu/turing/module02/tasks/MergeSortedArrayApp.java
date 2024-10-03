package az.edu.turing.module02.tasks;

import java.util.Arrays;

public class MergeSortedArrayApp {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 5, 8, 15, 20};
        int[] array2 = {2, 3, 6, 7, 13};
        int[] result = mergeSortedArrays(array1, array2);
        System.out.println("Result Array: " + Arrays.toString(result));
    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }
        while (i < a.length) {
            merged[k++] = a[i++];
        }
        while (j < b.length) {
            merged[k++] = b[j++];
        }
        return merged;
    }
}
