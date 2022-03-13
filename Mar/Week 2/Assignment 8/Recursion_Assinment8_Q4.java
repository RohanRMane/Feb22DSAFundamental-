/*4. Find GCD of two number using recursion. GCD(4,8) => 4.        */


public class Recursion_Assinment8_Q4 {
    static int gcd(int dividend, int divisor) {
        // Base case
        if (divisor == 0)
            return dividend;

        return gcd(divisor, dividend % divisor);
    }
    public static void main(String[] args) {
        System.out.println("H.C.F is "+gcd(4, 8));

    }
}