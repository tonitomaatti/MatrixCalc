
package matrixcalc;

/**
 *
 *
 */
public class Doolittle {
    
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
    
    public static double determinant(int[][] A){
        double[][] upper = decomposeU(A);
        double det = 1;
        for(int i = 0; i<A.length; i++){
            det *= upper[i][i]; 
        }
        return det;
    }
    
}
