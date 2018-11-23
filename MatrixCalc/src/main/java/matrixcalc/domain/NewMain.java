/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixcalc.domain;

import matrixcalc.test.Test;

/**
 *
 * @author <>
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testataan kakkosen potensseilla:
        //int pow2 = 1;
        
        int runsPerTest = 10;
        int size = 0;
        
        for(int i = 0; i<11; i++){
            Test.testDeterminantSpeed(size, runsPerTest);
            size +=100;
        }
        
    }
    
}
