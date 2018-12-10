# Implementation

File Structure:

![](https://github.com/tonitomaatti/MatrixCalc/blob/master/Documentation/Resources/FileStructureNetbeans.png)


The program takes square matrices as input and can do one of the following: 1. Add, 2. Substract, 3. Multiply, 
4. Find a determinant. Input is handled by simple GUI and matrices will be built to double[][] type tables.

Addition and Substraction are straightforward iterations through matrix entries. Multiplication is handled by Strassen algorithm,
and determinant is obtained by using a Doolittle algorithm to do a LU-decomposition. Determinant is then the diagonal of the upper
matrix.

The program only needs double[][] type data structures, so there's no own implementations.


## Multiplication:

Strassen algorithm is a recursive divide and conquer type algorithm. According to wikipedia, time complexity should be n^(2,81). 
According to initial tests, my implementation seems to be close to that.


## Determinant

The matrix is decomposed by LU decomposition. The determinant is then the product of the diagonal of the upper part. Time complexity
should be n^3. Implementation seems to be close to that.


## I/O

MatrixScanner takes String from GUI user input. It then transforms this into a double[][] matrix.

## UI

GUI is built with netbeans GUI building tool with instructions from https://netbeans.org/kb/docs/java/quickstart-gui.html

All functionality is accessible from GUI. You can input your own matrices and do calculations (buttons Add, Substract, Multiply and Determinant). You can also try to run you your own time tests with test buttons. Select maximum matrix size from dropdown menu. GUI has some notes and a text field to some console outputs.



