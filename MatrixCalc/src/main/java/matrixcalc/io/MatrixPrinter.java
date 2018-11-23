
package matrixcalc.io;

/**
 * Prints an int[][] or double[][] matrix
 */
public class MatrixPrinter {
    
    
     /**
     * Prints a double[][] type matrix
     * @param printable The matrix to be printed
     */
    public static void print(double[][] printable){
        for(int i = 0; i < printable.length; i++){
            for(int j = 0; j < printable.length; j++){
                System.out.print(printable[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
