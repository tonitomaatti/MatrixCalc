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
|:----:|:-----------------:|:---------------:|
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

(Starting point for 2^81 curve: 0,00113)

![](https://github.com/tonitomaatti/MatrixCalc/blob/master/Documentation/Resources/MultiplicationTimeAnalysis1.png)

Multiplication seems to follow the theoretical curve pretty closely



## For Determinant

Determinant does a LU decomposition and calculates determinant from the upper matrix.

| Size  | Running Time (ms) | 2^3 Curve (ms) |
|:-----:|:-----------------:|:---------------:|
|  0    | 0                 | 0               |
| 200   | 6                 | 76              |
|  400  | 64                | 608             |
| 600   | 494               | 2052            |
|  800  | 1576              | 4864            |
|  1000 | 4050              | 9500            |
|  1200 | 9960              | 16416           |
|  1400 | 20526             | 26068           |
|  1600 | 32006             | 38912           |
|  1800 | 50414             | 55404           |
|  2000 | 88814             | 76000           |
| 2200  | 86196             | 101156          |
|  2500 | 151332            | 148437,5        |

(Starting point for 2^3 curve: 0,0000095)

A slightly more erratic behavior. 

![](https://github.com/tonitomaatti/MatrixCalc/blob/master/Documentation/Resources/DeterminantTimeAnalysis1.png)
