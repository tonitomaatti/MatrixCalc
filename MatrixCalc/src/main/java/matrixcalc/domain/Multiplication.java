
package matrixcalc.domain;

/**
 * This is an algorithm to multiply two matrices
 * Strassen algorithm
 */
public class Multiplication {
    
    /**
     * First expand matrices to power of two so division always works, then call for recursive strassen
     * @param A First matrix
     * @param B Second matrix
     * @return Returns multiplied matrix
     */
    public static double[][] multiply(double[][] A, double[][] B){
        
        //Get to the power of two
        int size = A.length;
        int powerOfTwo = getNextPowerOfTwo(size);
        
        //create expanded
        double[][] Aexpand = expandToPowerOfTwo(A, powerOfTwo, size);
        double[][] Bexpand = expandToPowerOfTwo(B, powerOfTwo, size);
        
        
        //Get the mulitiplied matrix
        double[][] C = strassenRecursive(Aexpand, Bexpand);
        
        //trim C back
        double[][] Ctrimmed = trimFromPowerOfTwo(C, size);
        
        return Ctrimmed;
    }
    
    /**
     * Trims the matrix back to original size after result
     * @param X Matrix to be trimmed
     * @param size Original size
     * @return Trimmed matrix
     */
    private static double[][] trimFromPowerOfTwo(double[][] X, int size){
        double[][] Xtrimmed = new double[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Xtrimmed[i][j] = X[i][j]; 
            }
        }
        return Xtrimmed;
    }
    
    /**
     * Takes an integer and returns the closest larger power of two
     * @param size Original size
     * @return Next power of two
     */
    private static int getNextPowerOfTwo(int size){
        int powerOfTwo = 1;
        
        while(true){
            if(powerOfTwo<size){
                powerOfTwo *= 2;
            }else{
                break;
            }
        }
        return powerOfTwo;
    }
    
    /**
     * Expands a matrix to the next power of two. This makes division by 2  work every time
     * @param X Matrix to be expanded
     * @param powerOfTwo power of two to expand to
     * @param size original size
     * @return Expanded matrix
     */
    private static double[][] expandToPowerOfTwo(double[][] X, int powerOfTwo, int size){
        
        double[][] Xexpand = new double[powerOfTwo][powerOfTwo];
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Xexpand[i][j] = X[i][j];
                
            }
        }
        return Xexpand;
    }
    
    /**
     * This is a recursive matrix multipliying algorithm
     * @param A First expanded matrix
     * @param B Second expanded matrix
     * @return Returns expanded multiplied matrix
     */
    private static double[][] strassenRecursive(double[][] A, double[][] B){
        
        int size = A.length;
        
        //If reduced to single element, end of recursion
        if(size==1){
            double[][] single = new double[1][1];
            single[0][0] = A[0][0]*B[0][0];
            return single;
        }
        
        //Divide matrices to sub-matrices
        
        int subSize = size/2;
        double[][] a11 = createSubMatrix(A, subSize, 0,0);
        double[][] a12 = createSubMatrix(A, subSize, 0,subSize);
        double[][] a21 = createSubMatrix(A, subSize, subSize,0);;
        double[][] a22 = createSubMatrix(A, subSize, subSize,subSize);
        
        double[][] b11 = createSubMatrix(B, subSize, 0,0);
        double[][] b12 = createSubMatrix(B, subSize, 0,subSize);
        double[][] b21 = createSubMatrix(B, subSize, subSize,0);;
        double[][] b22 = createSubMatrix(B, subSize, subSize, subSize);
        
        //Create M-components:
        double[][] m1 = strassenRecursive(Addition.add(a11, a22),Addition.add(b11, b22));
        double[][] m2 = strassenRecursive(Addition.add(a21, a22), b11);
        double[][] m3 = strassenRecursive(a11, Substraction.substract(b12, b22));
        double[][] m4 = strassenRecursive(a22 , Substraction.substract(b21, b11));
        double[][] m5 = strassenRecursive(Addition.add(a11, a12),b22);
        double[][] m6 = strassenRecursive(Substraction.substract(a21, a11),Addition.add(b11, b12));
        double[][] m7 = strassenRecursive(Substraction.substract(a12, a22),Addition.add(b21, b22));
        
        //new submatrices:
        double[][] c11 = Substraction.substract(Addition.add(Addition.add(m1, m4), m7),m5);
        double[][] c12 = Addition.add(m3, m5);
        double[][] c21 = Addition.add(m2, m4);
        double[][] c22 = Addition.add(Substraction.substract(m1, m2), Addition.add(m3,m6));
        
        //Join new submatrices
        double[][] c = combineSubMatrices(subSize, size, c11, c12, c21, c22);
        
        return c;
    }
    
    /**
     * Combines submatrices back to original after multiplication results
     * @param subSize size of submatrix
     * @param size Original size
     * @param sub11 submatrix
     * @param sub12 submatrix
     * @param sub21 submatrix
     * @param sub22 submatrix
     * @return combined matrix
     */
    private static double[][] combineSubMatrices(int subSize, int size, double[][] sub11,
            double[][] sub12, double[][] sub21, double[][] sub22 ){
        
        double[][] joinedMatrix = new double[size][size];
        
        for(int i = 0; i < subSize; i++){
            for(int j = 0; j < subSize; j++){
                joinedMatrix[i][j] = sub11[i][j];
                joinedMatrix[i][j+subSize] = sub12[i][j];
                joinedMatrix[i+subSize][j] = sub21[i][j];
                joinedMatrix[i+subSize][j+subSize] = sub22[i][j];
            }
        }
        return joinedMatrix;
    }
    
    /**
     * Creates the submatrices when dividing the original to 4 parts
     * @param oldM The large original matrix to be divided
     * @param size The size of the new submatrix
     * @param startingRow Where to start rows, depends on which submatrix is being created
     * @param startingColumn Where to start columns, depends on which submatrix is being created
     * @return returns the created submatrix
     */
    private static double[][] createSubMatrix(double[][] oldM, int size, int startingRow, int startingColumn){
        
        double[][] subM = new double[size][size]; 
        
        for(int i = 0; i<size; i++){
            for(int j = 0; j < size;  j++){
                subM[i][j] = oldM[i+startingRow][j+startingColumn];
            }
        }    
        return subM;
    }
}
