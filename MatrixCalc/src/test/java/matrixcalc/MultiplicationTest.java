package matrixcalc;

import matrixcalc.domain.Multiplication;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author faarao
 */
public class MultiplicationTest {
    
    public MultiplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void correctMultipleWith2x2(){
        double[][] testMatrix = new double[2][2];
        testMatrix[0][0] = 1;
        testMatrix[0][1] = 2;
        testMatrix[1][0] = 3;
        testMatrix[1][1] = 4;
        
        testMatrix = Multiplication.multiply(testMatrix, testMatrix);
        
        double[][] correctMatrix = new double[2][2];
        correctMatrix[0][0] = 7;
        correctMatrix[0][1] = 10;
        correctMatrix[1][0] = 15;
        correctMatrix[1][1] = 22;
        
        org.junit.Assert.assertArrayEquals(testMatrix, correctMatrix);
    }
    
    @Test
    public void correctMultipleWithSingle(){
        double[][] testMatrix = new double[1][1];
        testMatrix[0][0] = 2;
        testMatrix = Multiplication.multiply(testMatrix, testMatrix);
        
        double[][] correctMatrix = new double[1][1];
        correctMatrix[0][0] = 4;
        
        org.junit.Assert.assertArrayEquals(testMatrix, correctMatrix);
    }
}
