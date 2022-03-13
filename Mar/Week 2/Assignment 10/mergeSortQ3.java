/*3. Write a vanilla Quick sort algorithm.*/


public class mergeSortQ3 {
    static int partition(int arr[], int start, int end) {
        int i = start - 1;
        int j = start;
        int p = arr[end];

        for (; j < end; j++) {
            if (arr[j] < p) {
                ++i;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[++i];
        arr[i] = arr[end];
        arr[end] = tmp;
        return i;
    }

    static void quicksort(int arr[], int start, int end) {
        
        if (start >= end) return;
        int pivot_idx = partition(arr, start, end);
        quicksort(arr, start, pivot_idx - 1);
        quicksort(arr, pivot_idx + 1, end);
    }

    public static void main(String[] args) {
        int a[] = { 64,24,35,-54,-6,52,-6,1,0,84,-54,6,3,-1 };
        quicksort(a, 0, a.length - 1);

        
        for (int i = a.length - 1; i >=0 ; i--) {
            System.out.print(a[i] + ",");
        }
    }
}