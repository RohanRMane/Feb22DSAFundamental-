/*5. Shuffle a array of string uniformly. eg [""abc"",""efg"",""hij"",""k"",""lmn"",""opq""]. */

import java.util.*;
public class mergeSortQ5 {
    static void shuffleArray(String[] arr) {
        Random rnd = new Random();
        for (int i = arr.length- 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
    }
    public static void main(String[] args) {
        String arr[] = { "abc","efg","hij","k","lmn","opq" };
        shuffleArray(arr);
        for (var x : arr) {
            System.out.print(x + ",");
        }

    }
}