package matrixcalc;

import matrixcalc.domain.Determinant;
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
public class DoolittleTest {
    
    public DoolittleTest() {
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
    public void correctDeterminantWith2x2(){
        int[][] testMatrix = new int[2][2];
        testMatrix[0][0] = 1;
        testMatrix[0][1] = 2;
        testMatrix[1][0] = 3;
        testMatrix[1][1] = 4;
        
        double determinant = Determinant.determinant(testMatrix);
        double expectedDeterminant = -2;
        
        Assert.assertEquals(determinant, expectedDeterminant, 0.001);
    }
    
    @Test
    public void correctDeterminantWith3x3(){
        int[][] testMatrix = new int[3][3];
        int entry = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                entry++;
                testMatrix[i][j] = entry;
            }
        }
        
        double determinant = Determinant.determinant(testMatrix);
        double expectedDeterminant = 0;
        
        //with delta 0.001;
        Assert.assertEquals(determinant, expectedDeterminant, 0.001);
    }
    
    @Test
    public void correctDeterminantWithSingle(){
        int[][] testMatrix = new int[1][1];
        testMatrix[0][0] = 1;
        
        
        double determinant = Determinant.determinant(testMatrix);
        double expectedDeterminant = 1;
        
        Assert.assertEquals(determinant, expectedDeterminant, 0.001);
    }
}
