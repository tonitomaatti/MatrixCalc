
package matrixcalc.domain;

/**
 * An algorithm to first decompose a matrix and then produce the determinant
 *
 */
public class Determinant {
    
    /**
     * Decomposes a matrix to lower and upper matrices A = LU. Doolittle's algorithm
     * @param A The matrix to be composed
     * @return Returns the upper matrix which is needed for determinant
     */
    private static double[][] decomposeU(int[][] A){
        int size = A.length;
        double[][] L = new double[size][size];
        double[][] U = new double[size][size];
        
        for(int k = 0; k<size; k++){
            
            //Upper
            for(int m = k; m<size; m++){
                double sum = 0;
                for(int j = 0; j<k; j++){
                    sum += L[k][j]*U[j][m];
                }
                U[k][m] = A[k][m] - sum;
            }
            
            //Lower
            L[k][k] = 1;
            for(int i = k+1; i<size; i++){
                double sum = 0;
                for(int j = 0; j<k; j++){
                    sum += L[i][j]*U[j][k];
                }
                L[i][k] = (A[i][k] - sum) / U[k][k];
            }
        }
        return U;
    }
    
    /**
     * Calculates the determinant from decomposed upper mattrix
     * @param A Matrix for the determinant
     * @return returns the determinant
     */
    public static double determinant(int[][] A){
        double[][] upper = decomposeU(A);
        double det = 1;
        for(int i = 0; i<A.length; i++){
            det *= upper[i][i]; 
        }
        return det;
    }
    
}
