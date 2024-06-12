package O1_Sort.SelectionSort;

import java.util.Arrays;

public class Step02 {
    public static void sort(int[] ar) {
        int max = ar[0];
        int index = 0;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                index = i;
            }
        }

        ar[index] = ar[ar.length - 1];
        ar[ar.length - 1] = max;
    }

    public static void main(String[] args) {
        int arr[] = {45, 16, 44, 79, 93, 99, 21, 64, 83};
        System.out.println(Arrays.toString(arr));               // [45,16,44,79,93,99,21,64,83]
        sort(arr);
        System.out.println(Arrays.toString(arr));               // [45,16,44,79,93,83,21,64,99]
    }
}
