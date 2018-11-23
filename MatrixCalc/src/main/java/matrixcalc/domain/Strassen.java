
package matrixcalc.domain;

/**
 * This is an algorithm to multiply two matrices
 * Strassen algorithm
 */
public class Strassen {
    
    /**
     * First expand matrices to power of two so division always works, then call for recursive strassen
     * @param A First matrix
     * @param B Second matrix
     * @return Returns multiplied matrix
     */
    public static int[][] multiply(int[][] A, int[][] B){
         //expand to the power of two
        int size = A.length;
        int powerOfTwo = 1;
        
        while(true){
            if(powerOfTwo<size){
                powerOfTwo *= 2;
            }else{
                break;
            }
        }
        
        //create expanded
        int[][] Aexpand = new int[powerOfTwo][powerOfTwo];
        int[][] Bexpand = new int[powerOfTwo][powerOfTwo];
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Aexpand[i][j] = A[i][j];
                Bexpand[i][j] = B[i][j];
            }
        }
        
        int[][] C = strassenRecursive(Aexpand, Bexpand);
        
        //trim C back
        int[][] Ctrimmed = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Ctrimmed[i][j] = C[i][j]; 
            }
        }
        return Ctrimmed;
    }
    
    /**
     * This is a recursive matrix multipliying algorithm
     * @param A First expanded matrix
     * @param B Second expanded matrix
     * @return Returns expanded multiplied matrix
     */
    private static int[][] strassenRecursive(int[][] A, int[][] B){
        
        int length = A.length;
        
        //If reduced to single element, end of recursion
        if(length==1){
            
            int[][] single = new int[1][1];
            single[0][0] = A[0][0]*B[0][0];
            return single;
        }
        
        //Divide matrices to sub-matrices
        
        int n = length/2;
        int[][] a11 = createSubMatrix(A, n, 0,0);
        int[][] a12 = createSubMatrix(A, n, 0,n);
        int[][] a21 = createSubMatrix(A, n, n,0);;
        int[][] a22 = createSubMatrix(A, n, n,n);
        
        int[][] b11 = createSubMatrix(B, n, 0,0);
        int[][] b12 = createSubMatrix(B, n, 0,n);
        int[][] b21 = createSubMatrix(B, n, n,0);;
        int[][] b22 = createSubMatrix(B, n, n,n);
        
        //Create M-components:
        int[][] m1 = strassenRecursive(Addition.add(a11, a22),Addition.add(b11, b22));
        int[][] m2 = strassenRecursive(Addition.add(a21, a22), b11);
        int[][] m3 = strassenRecursive(a11, Substraction.substract(b12, b22));
        int[][] m4 = strassenRecursive(a22 , Substraction.substract(b21, b11));
        int[][] m5 = strassenRecursive(Addition.add(a11, a12),b22);
        int[][] m6 = strassenRecursive(Substraction.substract(a21, a11),Addition.add(b11, b12));
        int[][] m7 = strassenRecursive(Substraction.substract(a12, a22),Addition.add(b21, b22));
        
        //new submatrices:
        int[][] c11 = Substraction.substract(Addition.add(Addition.add(m1, m4), m7),m5);
        int[][] c12 = Addition.add(m3, m5);
        int[][] c21 = Addition.add(m2, m4);
        int[][] c22 = Addition.add(Substraction.substract(m1, m2), Addition.add(m3,m6));
        
        //Join new submatrices
        int[][] c = new int[length][length];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = c11[i][j];
                c[i][j+n] = c12[i][j];
                c[i+n][j] = c21[i][j];
                c[i+n][j+n] = c22[i][j];
            }
        }
        return c;
    }
    
    /**
     * Creates the submatrices when dividing the original to 4 parts
     * @param oldM The large original matrix to be divided
     * @param size The size of the new submatrix
     * @param startingRow Where to start rows, depends on which submatrix is being created
     * @param startingColumn Where to start columns, depends on which submatrix is being created
     * @return returns the created submatrix
     */
    private static int[][] createSubMatrix(int[][] oldM, int size, int startingRow, int startingColumn){
        
        int[][] subM = new int[size][size]; 
        
        for(int i = 0; i<size; i++){
            for(int j = 0; j < size;  j++){
                subM[i][j] = oldM[i+startingRow][j+startingColumn];
            }
        }    
        return subM;
    }
}
