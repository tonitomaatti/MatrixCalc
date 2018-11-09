package matrixcalc;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        //for now a temporary way to enter matrices for testing
        MatrixScanner ms = new MatrixScanner();
        
        //build and print test
//        int[][] a = ms.buildMatrix();
//        System.out.println("pituus on "+a.length);
//        
//        ms.print(a);
        
        //addition test:
        int[][] b = ms.buildMatrix();
        int[][] c = ms.buildMatrix();
        
        Addition add = new Addition();
        
        int[][] addedMatrix = add.add(b, c);
        
        ms.print(addedMatrix);
        
       
        
    }
    
}
