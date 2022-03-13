//2. Print wave in matrix


public class Matix2dQ2 {
    public static void main(String[] args) {
        
        int[][] waveMatrix= {
                { 39, 0, 31, 2},
                { 55, 64, 97, 69},
                { 9, 84, 46, 18},
                { 42, 94, 135, 36}
        };
    
        for(int j = 0; j < waveMatrix[0].length; j++){

            if(j%2 == 0){
                for(int i = 0; i < waveMatrix.length; i++){
                    System.out.println(waveMatrix[i][j]);
                }
            } else {
                for(int i = waveMatrix.length-1; i>= 0; i--){
                    System.out.println(waveMatrix[i][j]);
                }
            }
        }
    }

}