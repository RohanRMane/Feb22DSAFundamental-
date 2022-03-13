/*3. https://leetcode.com/problems/powx-n/ "*/

public class Recursion_Assinment9_Q3 {
    static int kthGrammar(int n, int k) {
        if (k == 1 && n == 1) {
            return 0;
        }

        int mid = (int) Math.pow(2, n - 1) / 2;
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } else {
            return 1 ^ (kthGrammar(n - 1, k - mid));
        }
    }
        public static void main(String[] args) {
            System.out.println(kthGrammar(1,1));
            System.out.println(kthGrammar(2,1));
            System.out.println(kthGrammar(2,2));
    }
}