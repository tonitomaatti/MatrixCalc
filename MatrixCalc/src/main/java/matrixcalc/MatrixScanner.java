
package matrixcalc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A temporary way to create a matrix
 * 
 */
public class MatrixScanner {
    
    /**
     * Read size and elements from user input
     * @return description: (return)
     */
    public int[][] buildMatrix(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Give Row lenght: ");
        
        int rowLength = sc.nextInt();
        
        int row = 0;
        int column = -1;
        int count = 0;
        
        int[][] a = new int[rowLength][rowLength];
        
        while(true){
            System.out.println("Next entry: ");
            if(!sc.hasNextInt()){
                break;
            }
            int entry = sc.nextInt();
            if(column == rowLength-1){
                row++;
                column = -1;
            }
            column++;
            System.out.println("Setting number "+entry+" to row "+row+" and column "+column);
            a[row][column] = entry;
            count++;
            if(count==rowLength*rowLength){
                break;
            }
        }
        
        System.out.println(Arrays.deepToString(a));
        
        return a;
    }
    
    /**
     * print the matrix in matrixy -looking way
     * @param printable (description printable)
     */
    public static void print(int[][] printable){
        for(int i = 0; i < printable.length; i++){
            for(int j = 0; j < printable.length; j++){
                System.out.print(printable[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
