
package matrixcalc.io;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author <>
 */
public class MatrixScannerTest {
    
    public MatrixScannerTest() {
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
    public void scannerProducesCorrectMatrix(){
        String testString = "1,2,3,4";
        
        double[][] testMatrix = MatrixScanner.buildMatrixFromGUI(testString);
        
        double[][] correctMatrix = new double[2][2];
        correctMatrix[0][0] = 1;
        correctMatrix[0][1] = 2;
        correctMatrix[1][0] = 3;
        correctMatrix[1][1] = 4;
        
        Assert.assertArrayEquals(testMatrix, correctMatrix);
        
    }
    
}
