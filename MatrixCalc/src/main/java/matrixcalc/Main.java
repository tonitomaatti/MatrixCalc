package matrixcalc;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        //For now everything is for square matrices
        
        //for now a temporary way to enter matrices for testing
        MatrixScanner ms = new MatrixScanner();
        
        //build and print test
//        int[][] a = ms.buildMatrix();
//        System.out.println("pituus on "+a.length);
//        
//        ms.print(a);
        
        //addition test:
        System.out.println("Enter first matrix");
        int[][] a = ms.buildMatrix();
        //System.out.println("Enter second matrix");
        //int[][] b = ms.buildMatrix();
        System.out.println("lenght of a: ");
        System.out.println(a.length);
        
        System.out.println("New Matrices: ");
        System.out.println("A: ");
        ms.print(a);
        //System.out.println("B: ");
        //ms.print(b);
        
        //Addition add = new Addition();
        
        //int[][] addedMatrix = add.add(b, c);
        
        //System.out.println("Result of addition: ");
        //ms.print(addedMatrix);
        
        //Strassen:
        //int[][] kerroin = Strassen.strassenRecursive(a, a);
        //ms.print(kerroin);
        
        //Determinantti:
        double deter = Doolittle.determinant(a);
        System.out.println("Determinantti: "+deter);
        
        
        //Substract
        //int[][] substract = Substraction.substract(a, b);
        //ms.print(substract);
        
       
        
    }
    
}
