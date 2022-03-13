/*4. Write a randomized quick sort, to sort the input arrays in descending order. */

import java.util.*;
public class mergeSortQ4 {
    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    static int partition(int a[], int start, int end) {
        int i = start - 1;
        int j = start;
        int p = a[end];

        for (; j < end; j++) {
            if (a[j] < p) {
                ++i;

                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }

        int tmp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = tmp;
        return i + 1;
    }

    static void quicksort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int pivot_idx = partition(arr, s, e);
        quicksort(arr, s, pivot_idx - 1);
        quicksort(arr, pivot_idx + 1, e);

    }

    public static void main(String args[]) {
        int arr[] = { 64,24,35,-54,-6,52,-6,1,0,84,-54,6,3,-1};
        shuffleArray(arr);
        quicksort(arr, 0, arr.length - 1);

    
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}