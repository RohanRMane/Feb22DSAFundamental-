//https://www.geeksforgeeks.org/program-for-mean-and-median-of-an-unsorted-array/

import java.util.*;
public class SortArrayQ3 {
    public static void main(String[] args) {
        int arr[] = { 54, 61, 25, 78, 12, 68, 21, 35, 52 };
        int len = arr.length;
        System.out.println("Mean = " + findMean(arr, len));
        System.out.println("Median = " + findMedian(arr, len));
    }
     static double findMean(int array[], int size){
        int sum = 0;
        for (int i = 0; i < size; i++)
            sum = sum + array[i];

        return (double)sum / (double)size;
    }

     static double findMedian(int array[], int size) {

        Arrays.sort(array);
        if (size % 2 != 0) {
            return (double) (array[size / 2]);
        }

        return (double)((array[(size - 1) / 2] + array[size / 2]) / 2.0);
    }
}