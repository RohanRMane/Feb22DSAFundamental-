//https://leetcode.com/problems/sort-an-array/

public class SortArrayQ1 {
    static int[] sort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = { 5, 2, 3, 1 };
        int[] arr2 = { 5, 1, 1, 2, 0, 0 };
        int[] result = sort(arr1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        result = sort(arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
