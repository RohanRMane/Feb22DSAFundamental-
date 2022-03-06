//https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.*;

public class ArraysQ2 {
    public static void main(String[] args){
        int[] NOne = {9,4,9,8,4};
        int[] NTwo = {4,9,5};
        int lengthOne = NOne.length;
        int lengthTwo = NTwo.length;
        int a = 0,b = 0,c = 0;
        Arrays.sort(NOne);//sorting array in ascending
        Arrays.sort(NTwo);

        while(a < lengthOne  && b < lengthTwo){
            if(NOne[a] < NTwo[b]){
                a++;
            }else if(NOne[a] > NTwo[b]){
                b++;
            }else {
                NOne[c+1]=NOne[a++];//in k value of intersection b/w two number will be save
                b++;
                System.out.println("intersection of array is "+NOne[a]+" "+NTwo[c]);
            }

        }
    }
}                                                                                                                                                                              