/*2. https://leetcode.com/problems/k-th-symbol-in-grammar/  */

public class Recursion_Assinment9_Q2 {
    static double myPow(double x, int n) {
        double res = 1;
        if(n < 0){
            n = -n;
            x = 1 / x; 
        }
        for(int i = 0; i < n; i++) {
            res = res * x;
        }
        return res;
    }
    public static void main(String[] args) {
        double rslt = myPow(2.00000, 10);
        System.out.println(" power of 2.00000^10 is "+ rslt);

        rslt = myPow( 2.10000,  3);
        System.out.println(" power of 2.10000^3 is "+rslt);

        rslt = myPow(2.00000,  -2);
        System.out.println(" power of 2.00000^-2 is "+rslt);


    }
}