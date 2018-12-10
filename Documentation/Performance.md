# Performance analysis

I created a test class to test run times of Multiplication and Determinant. A Test generates random double[][] (with values from
-1000 to 1000) type matrices with user-specified size and runs either Multiplication or Determinant -algorithm. 
Elapsed time is collected. These tests are run many times (for my graphs, 10) and average time is reported back.


Comparing size and elapsed time, we can see how the algorithms behave and determine time complexity. I created a theoretical curve
with established time complexities. The theoretical slope is fitted by trying to find a best starting point.

## For Multiplication

Multiplication is tested with sizes of power of two. This is because the algorithm expands every matrix to power of two before
Strassen algorithm.

| Size | Running Time (ms) | 2^81 Curve (ms) |
|------|-------------------|-----------------|
|  1   | 0                 | 0               |
| 2    | 0                 | 0               |
| 4    | 0                 | 0               |
| 8    | 2                 | 0               |
| 16   | 3                 | 3               |
| 32   | 23                | 19              |
| 64   | 135               | 134             |
| 128  | 844               | 943             |
| 256  | 5925              | 6610            |
| 512  | 42332             | 46358           |
| 1024 | 326897            | 325103          |

![](https://github.com/tonitomaatti/MatrixCalc/blob/master/Documentation/Resources/MultiplicationTimeAnalysis1.png)




## For Determinant

A slightly more erratic behavior. 

![](https://github.com/tonitomaatti/MatrixCalc/blob/master/Documentation/Resources/DeterminantTimeAnalysis.png)

---will do more analysis later.

## HowTo

You can run tests from "NewMain" class. Either Test.testDeterminantSpeed(int size, int runsPerTest); or 
testMultiplicationSpeed(int size, int runs). Matrix value types have to changed manually for now.
