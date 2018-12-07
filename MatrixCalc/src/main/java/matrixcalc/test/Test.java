package matrixcalc.test;

import matrixcalc.domain.Determinant;
import matrixcalc.domain.Multiplication;

/**
 *
 * Running time tests for multiplication and determinant 
 */
public class Test {
    
    /**
     * Tests multiplication speeds by average
     * @param size size of matrix
     * @param runs amount of runs to be done. Average is printed
     */
    public static double testMultiplicationSpeed(int size, int runs){
        
        long sum = 0;
        
        for(int i=0; i<runs; i++){
            double[][] toTest1 = GenerateMatrix.generate(size, -1000, 1000);
            double[][] toTest2 = GenerateMatrix.generate(size, -1000, 1000);
            long startTime = System.currentTimeMillis();
            Multiplication.multiply(toTest1, toTest2);
            long endTime = System.currentTimeMillis();
            sum += (endTime - startTime);
        }
        
        long average = sum / runs;
        
        
        
        return (double) average;
    }
    
    /**
     * Nanotime test for multiplication
     * @param size Size of matrix
     * @param runs Amount of runs
     */
    public static void testMultiplicationNano(int size, int runs){
        long sum = 0;
        
        for(int i=0; i<runs; i++){
            double[][] toTest1 = GenerateMatrix.generate(size, -1000, 1000);
            double[][] toTest2 = GenerateMatrix.generate(size, -1000, 1000);
            long startTime = System.nanoTime();
            Multiplication.multiply(toTest1, toTest2);
            long endTime = System.nanoTime();
            sum += (endTime - startTime);
        }
        
        long average = sum / runs;
        
        System.out.println("Running time: " + average + "nanoseconds "+"with size of "+size);
    }
    
    /**
     * Tests running time for determinant algorithm
     * @param size size of matrix
     * @param runs Amount of runs. Average is printed
     */
    public static double testDeterminantSpeed(int size, int runs){
        
        long sum = 0;
        
        for(int i=0; i<runs; i++){
            double[][] toTest1 = GenerateMatrix.generate(size, -1000, 1000);
            long startTime = System.currentTimeMillis();
            Determinant.determinant(toTest1);
            long endTime = System.currentTimeMillis();
            sum += (endTime - startTime);
        }
        
        long average = sum / runs;
        
        System.out.println("Running time: " + average + "ms. "+"with size of "+size);
        
        return (double) average;
    }
    
    
    
    
    
    
}
