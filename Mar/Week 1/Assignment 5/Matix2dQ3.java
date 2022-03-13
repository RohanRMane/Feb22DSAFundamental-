//3.Print spiral in matrix

public class Matix2dQ3 {
    public static void main(String[] args) {
        
        int[][] spiralMatrix= {
                { 98, 74, 68, 15, 35, 654},
                {54, 65, 85, 357, 159, 65},
                {5, 98, 47, 251, 364, 265}
        };
        int minRow = 0;
        int minCol = 0;
        int maxRow = spiralMatrix.length-1;
        int maxCol = spiralMatrix[0].length-1;;
        int count = 0;
        int totalNoOfElements = 3*6;//row=3 n columns=5

        while(count < totalNoOfElements){
            //1)printing left side--> top to bottom i.e left wall
            for(int i = minRow, j = minCol;i <= maxRow && count < totalNoOfElements; i++){//minRow will constant
                System.out.print(spiralMatrix[i][j]+" ");
                count++;
            }
            minCol++;

            //2)printing  bottom-->left to right i.e bottom wall
            for(int j = minCol, i = maxRow; j <= maxCol && count < totalNoOfElements; j++){//minColumn will constant
                System.out.print(spiralMatrix[i][j]+" ");
                count++;
            }
            maxRow--;

            //3.printing  bottom to top i.e right wall
            for(int i = maxRow, j = maxCol; i >= minRow && count < totalNoOfElements; i--){//maxCOl will constant
                System.out.print(spiralMatrix[i][j]+" ");
                count++;
            }
            maxCol--;

            //4.top 
            for(int j=maxCol, i = minRow; j >= minCol && count < totalNoOfElements; j--){//minRow will constant
                System.out.print(spiralMatrix[i][j]+" ");
                count++;
            }
            minRow++;
        }
    }
}