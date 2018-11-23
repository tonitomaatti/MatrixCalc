package matrixcalc.test;

import java.util.Random;

/**
 *
 *
 */
public class GenerateMatrix {
    
    
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
