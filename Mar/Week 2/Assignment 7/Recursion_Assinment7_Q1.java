/*"1.Reverse a number using a recursive program.*/


public class Recursion_Assinment7_Q1 {
    public static void main(String[] args){
        int num = 123456789;
        reverse (num);

    }
    static void reverse ( int num) {
        if( num < 10){ 
                    
            System.out.print(num  + " ");
            return ;
        }

          System.out.print(num % 10 + " ");
          reverse( num /10) ;

    }
}

