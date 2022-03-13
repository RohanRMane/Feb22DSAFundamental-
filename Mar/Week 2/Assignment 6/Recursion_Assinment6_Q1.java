

//1.Write a recursive code for finding the max and min element in the given array arr ={1,-1,0,2,-2,3,-3,4,-4}
// NOTE: pass arr in every function call.
        

        public class Recursion_Assinment6_Q1 {
            public static void main(String[] args){
                int[] arr = {3,5,-1,6,2,-2,8,-5};
                 min( arr, 0);
                 max( arr, 0);
        
            }
        
            static void min( int[] arr, int idx){
                int minValue = arr[0];
                
                if(arr.length == idx){
                    System.out.println("End of array ");
                    return ;
                }
        
                if(arr[idx] < minValue){
                    minValue = arr[idx];
                    System.out.println("Minimum number is "+ minValue );
                    System.out.println("Last value  before end of array is Minimum number  " );
                }
        
                min( arr, idx + 1);
        
            }
        
            static void max( int[] arr,int idx){
                int maxValue = arr[0];
            
                if(arr.length == idx){
                    System.out.println("End of array ");
                    return ;
                }
                
                if(arr[idx] > maxValue){
                    maxValue = arr[idx];
                    System.out.println("Maximum number is "+ maxValue );
                    System.out.println("Last value  before end of array is Maximum number  " );
                }
                max( arr, idx + 1);
            }
        }
        