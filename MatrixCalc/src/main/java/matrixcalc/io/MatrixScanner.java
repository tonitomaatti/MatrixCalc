
package matrixcalc.io;

/**
 * Used to construct matrices
 * 
 */
public class MatrixScanner {
    
    /**
     * Takes matrix from GUI in string form and returns it in double for math operations
     * @param input Matrix in string
     * @return matrix in double[][]
     */
    public static double[][] buildMatrixFromGUI(String input){
        String[] numbers = input.split(",");
        for(String number : numbers){
            System.out.println(number);
        }
        int size = (int) Math.sqrt(numbers.length);
        double[][] a = new double[size][size];
        int i = 0;
        int j = 0;
        for(String number : numbers){
            a[j][i] = Double.valueOf(number);
            i++;
            if(i==size){
                i=0;
                j++;
            }
        }
        return a;
    }
}
