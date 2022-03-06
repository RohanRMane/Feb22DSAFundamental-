//https://leetcode.com/problems/sort-colors/

public class SortArrayQ2 {
   
    static  int[] sortColors(int[] nums) {
        int lng = nums.length;

        for (int i = 1; i < lng; i++) {
            int j = i;
            int a = nums[i];

            while ((j > 0) && (nums[j - 1] > a)) {
                nums[j] = nums[j - 1];
                j--;
            }

            nums[j] = a;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] arrOne = {2,0,2,1,1,0};
        int[] result = sortColors(arrOne);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
        int[] arrTwo = {2,0,1};
        result = sortColors(arrTwo);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}