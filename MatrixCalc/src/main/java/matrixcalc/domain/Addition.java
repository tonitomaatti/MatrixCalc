
package matrixcalc.domain;

/**
 * Adds two matrices together by simply iterating through every element
 */
public class Addition {
    
    /**
     * Adds two matrices and returns the sum
     * @param matrixA desc
     * @param matrixB desc
     * @return the sum
     */
    public static double[][] add(double[][] matrixA, double[][] matrixB ){
        
        double[][] matrixC = new double[matrixA.length][matrixA.length];
        
        for(int i = 0; i<matrixA.length; i++){
            for(int j = 0; j<matrixA.length; j++){
               matrixC[i][j] = matrixA[i][j] + matrixB[i][j]; 
            }
        }
        return matrixC;
    }
}
