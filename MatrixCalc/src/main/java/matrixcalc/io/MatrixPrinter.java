
package matrixcalc.io;

/**
 * Prints an int[][] or double[][] matrix
 */
public class MatrixPrinter {
    
    /**
     * print the matrix in matrixy -looking way
     * @param printable Matrix to be printed
     */
    public static void print(int[][] printable){
        for(int i = 0; i < printable.length; i++){
            for(int j = 0; j < printable.length; j++){
                System.out.print(printable[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
     /**
     * Prints a double[][] type matrix
     * @param printable The matrix to be printed
     */
    public static void printDouble(double[][] printable){
        for(int i = 0; i < printable.length; i++){
            for(int j = 0; j < printable.length; j++){
                System.out.print(printable[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
