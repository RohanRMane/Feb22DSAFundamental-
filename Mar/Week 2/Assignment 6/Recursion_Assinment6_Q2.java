//2.Write a recursive code for printing the Fibonacci series up to N.
//example : if the user enters 10 , then print 1,1,2,3,5,8,13,21,34,55

        public class Recursion_Assinment6_Q2 {
            public static void main(String[] args){
        
                int count=15;
                System.out.print(n1+" "+n2);
                printFibonacci(count-2);
            }
        
            static int n1=0,n2=1,n3=0;
        
            static void printFibonacci(int count){
                if(count > 0){
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.print(" "+n3);
                    printFibonacci(count-1);
                }
            }
        
        }