
package matrixcalc;

/**
 *
 * Substact matrix A from B, same logic as addition
 */
public class Substraction {
    /**
     * Substracts two matrices and returns the result
     * @param matrixA desc
     * @param matrixB desc
     * @return the result
     */
    public static int[][] substract(int[][] matrixA,int[][] matrixB ){
        
        int[][] matrixC = new int[matrixA.length][matrixA.length];
        
        for(int i = 0; i<matrixA.length; i++){
            for(int j = 0; j<matrixA.length; j++){
               matrixC[i][j] = matrixA[i][j] - matrixB[i][j]; 
            }
        }
        return matrixC;
    }
}
