/*
4. Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.*/
public class binarySearchQ4 {
    static int binarySearch(int[] array,int target){
        int start=0;
        int end=array.length-1;
        int index=-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target>array[mid]){
                start=mid+1;
                index=start;
            }
            else{
                end=mid-1;
                index=end;
            }
        }
        return index;
    }
    public static void main(String[] args)
    {
        int array[]={1,3,5,6};
        int index=binarySearch(array,2);
        System.out.println("Element to be inserted at index and the index is:  "+index);
        index=binarySearch(array,7);
        System.out.println("Element to be inserted at index and the index is:  "+index);
    }
}