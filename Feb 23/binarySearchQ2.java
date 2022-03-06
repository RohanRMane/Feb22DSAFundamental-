/*2. For the given array = ['a','b','d','e','f','g','h','i','x','z']
use binary search to find the target element = 'z'.
*/
public class binarySearchQ2 {
    
        static int binarySearch(char[] array,char target){
            int start=0;
            int end=array.length-1;

            while(start<=end){

                int mid=start+(end-start)/2;

                if(target==array[mid]){
                    return mid;
                }
                else if(target>array[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return -1;
        }
        public static void main(String[] args){
            char[] array={'a','b','d','e','f','g','h','i','x','z'};
            char target='z';
            int index=binarySearch(array,target);
                if(index!=-1){
                    System.out.println("Target found and index of the target is "+index);
                }
                else{
                    System.out.println("Target not found so  default index of the target is "+index);
                }
        }
} 