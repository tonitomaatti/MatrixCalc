package matrixcalc;

import matrixcalc.domain.Addition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdditionTest {
    
    public AdditionTest() {
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
    public void AdditionWorksCorrectly(){
        double[][] testMatrix = new double[2][2];
        testMatrix[0][0] = 1;
        testMatrix[0][1] = 2;
        testMatrix[1][0] = 3;
        testMatrix[1][1] = 4;
        
        testMatrix = Addition.add(testMatrix, testMatrix);
        
        double[][] correctMatrix = new double[2][2];
        correctMatrix[0][0] = 1+1;
        correctMatrix[0][1] = 2+2;
        correctMatrix[1][0] = 3+3;
        correctMatrix[1][1] = 4+4;
        
        Assert.assertArrayEquals(testMatrix, correctMatrix);
    }
    
}
