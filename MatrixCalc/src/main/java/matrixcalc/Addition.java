
package matrixcalc;


public class Addition {
    private int[][] a;
    private int[][] b;

    
    public Addition(){
    }
    
    public Addition(int[][] matrixA, int[][] matrixB){
        this.a = matrixA;
        this.b = matrixB;
    }
    
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
