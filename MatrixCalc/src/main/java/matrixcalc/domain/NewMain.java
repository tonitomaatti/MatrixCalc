
package matrixcalc.domain;

import matrixcalc.io.MatrixPrinter;
import matrixcalc.test.GenerateMatrix;
import matrixcalc.test.Test;

/**
 *
 * 
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SUGGESTIONS FOR WHAT TO DO:
        
        //Run Determinant Tests
        int runsPerTest = 10;
        int size = 0;
        //Add iterations for larger tests
        System.out.println("DETERMINANT SPEED TESTS: ");
        for(int i = 0; i<6; i++){
            Test.testDeterminantSpeed(size, runsPerTest);
            size +=100;
        }
        System.out.println("");
        
        //Run Multiplication Tests
        int runs = 10;
        int powerOfTwo = 1;
        //Add iterations for larger tests
        System.out.println("MULTIPLICATION SPEED TESTS:");
        for(int i = 0; i<6; i++){
            Test.testMultiplicationSpeed(powerOfTwo, runs);
            powerOfTwo *= 2;
        }
        System.out.println("");
        
        //Add Matrices And Print
        double[][] A = GenerateMatrix.generate(4, -100, 100);
        double[][] B = GenerateMatrix.generate(4, -100, 100);
        System.out.println("");
        System.out.println("ADDED MATRIX: ");
        System.out.println("");
        double[][] Added = Addition.add(A, B);
        MatrixPrinter.print(Added);
        
        //Multiply Matrices And Print
        double[][] multA = GenerateMatrix.generate(4, -100, 100);
        double[][] multB = GenerateMatrix.generate(4, -100, 100);
        System.out.println("");
        System.out.println("Multiplied Matrix: ");
        System.out.println("");
        double[][] Multiplied = Multiplication.multiply(A, B);
        MatrixPrinter.print(Multiplied);
        
        //Get Determinant And Print
        double[][] X = GenerateMatrix.generate(4, -100, 100);
        System.out.println("");
        System.out.println("Determinant: ");
        System.out.println("");
        double determinant = Determinant.determinant(X);
        System.out.println(determinant);
    }
}
