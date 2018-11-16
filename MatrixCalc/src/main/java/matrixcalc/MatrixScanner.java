
package matrixcalc;

import java.util.Scanner;

/**
 * A temporary way to create a matrix
 * 
 */
public class MatrixScanner {
    
    /**
     * Read size and elements from user input
     * @return returns a matrix build from user input
     */
    public int[][] buildMatrix(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Give Row lenght: ");
        
        int rowLength = sc.nextInt();
        
        int row = 0;
        int column = -1;
        int count = 0;
        
        int[][] a = new int[rowLength][rowLength]; //user selected row length determines size
        
        //loop: Go on until false input or matrix is full, when row is full, change to next one
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
        
        return a;
    }
    
    /**
     * print the matrix in matrixy -looking way
     * @param printable Matrix to be printed
     */
    public static void print(int[][] printable){
        for(int i = 0; i < printable.length; i++){
            for(int j = 0; j < printable.length; j++){
                System.out.print(printable[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    /**
     * Prints a double[][] type matrix
     * @param printable The matrix to be printed
     */
    public static void printDouble(double[][] printable){
        for(int i = 0; i < printable.length; i++){
            for(int j = 0; j < printable.length; j++){
                System.out.print(printable[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
