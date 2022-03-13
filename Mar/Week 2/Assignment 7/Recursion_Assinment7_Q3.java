/*3.Write a recursive binary search.*/

public class Recursion_Assinment7_Q3 {
     static int binarySearch(int arr[], int left, int right, int target){
        if (right >= left) {
            int mid = left + (right - left) / 2;


            if (arr[mid] == target){
                return mid;
            }


            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }
            return binarySearch(arr, mid + 1, right, target);
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40,50,60,70,85,100,110,520};
        int lngth = arr.length;
        int target = 110;
        int result = binarySearch(arr, 0, lngth - 1, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}