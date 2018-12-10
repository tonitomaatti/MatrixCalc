package matrixcalc.test;

import java.util.Random;

/**
 * Generates a matrix for testing purposes
 * 
 */
public class GenerateMatrix {
    
    /**
     *
     * @param size wanted size for matrix
     * @param minRange minimum range of values
     * @param maxRange maximum range of values
     * @return generated matrix
     */
    public static double[][] generate(int size, double minRange, double maxRange){
        Random r = new Random();
        
        double[][] A = new double[size][size];
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                A[i][j] = r.nextDouble()*(maxRange-minRange)+minRange;
            }
        }
        return A;
    }
}
