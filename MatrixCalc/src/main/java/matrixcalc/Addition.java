
package matrixcalc;

/**
 * Adds two matrices together by simply iterating through every element
 */
public class Addition {
    private int[][] a;
    private int[][] b;

    /**
     *
     */
    public Addition(){
    }
    
    /**
     *
     * @param matrixA desc
     * @param matrixB desc
     */
    public Addition(int[][] matrixA, int[][] matrixB){
        this.a = matrixA;
        this.b = matrixB;
    }
    
    /**
     * Adds two matrices and returns the sum
     * @param matrixA desc
     * @param matrixB desc
     * @return the sum
     */
    public int[][] add(int[][] matrixA,int[][] matrixB ){
        
        int[][] matrixC = new int[matrixA.length][matrixA.length];
        
        for(int i = 0; i<matrixA.length; i++){
            for(int j = 0; j<matrixA.length; j++){
               matrixC[i][j] = matrixA[i][j] + matrixB[i][j]; 
            }
        }
        
        return matrixC;
    }
    
    

    
}
