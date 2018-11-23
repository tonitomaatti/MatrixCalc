package matrixcalc.test;

import matrixcalc.domain.Multiplication;
import matrixcalc.io.MatrixPrinter;
/**
 *
 *
 */
public class Test {
    
    public static void testMultiplicationSpeed(int size, int runs){
        
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
        
        System.out.println("Running time: " + average + "ms. "+"with size of "+size);
    
    }
    
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
    
    
    
    
    
    
}
