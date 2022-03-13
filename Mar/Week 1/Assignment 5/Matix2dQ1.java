//Create and print elements in matrix

import java.util.*;
public class Matix2dQ1 {
    public static void main(String[] args) {
        int[][]matrix = new int[3][3];
        int row = matrix.length;
        int col = matrix[0].length;

        //taking user input
        Scanner sc=new Scanner(System.in);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                System.out.println("Enter value of matix: ");
                matrix[i][j]=sc.nextInt();
            }
        }

        //displaying user input
        System.out.println("Enter value of matix is ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
 }
