# Implementation

The program takes square matrices as input and can do one of the following: 1. Add, 2. Substract, 3. Multiply, 
4. Find a determinant. Input will probably be handled by simple GUI and matrices will be built to double[][] type tables.

Addition and Substraction are straightforward iterations through matrix entries. Multiplication is handled by Strassen algorithm,
and determinant is obtained by using a Doolittle algorithm to do a LU-decomposition. Determinant is then the diagonal of the upper
matrix.

The program only needs double[][] type data structures, so there's no own implementations.

------Will do better time analysis later----

## Multiplication:

Strassen algorithm is a recursive divide and conquer type algorithm. According to wikipedia, time complexity should be n^(2,81). 
According to initial tests, my implementation seems to follow to be close to that.

![](https://github.com/tonitomaatti/MatrixCalc/blob/master/Documentation/MultiplicationTimeAnalysis.png)


## Determinant

The matrix is decomposed by LU decomposition. The determinant is then the product of the diagonal of the upper part. Time complexity
should be n^3. Not sure yet how closely the implementation follows that.

![](https://github.com/tonitomaatti/MatrixCalc/blob/master/Documentation/DeterminantTimeAnalysis.png)

## UI and I/O

Work in process. For now, you can run do stuff from main. Generate matrices by calling GenereateMatrix.generate(params). You can
also run time analysis tests with Test class. 




