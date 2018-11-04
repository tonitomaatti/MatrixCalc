# Project Definition

The aim of the project is to produce a calculator for matrices with basic operations (addition, subtraction, multiplication) and a method for finding the determinant.

### I/O
The calculator takes as input two matrices (As simple lists with row length, for example) and wanted operation, and as output produces the result of the operation.

### Algorithms and time complexities

| Operation       | Algorithm                             | Complexity |
|-----------------|---------------------------------------|------------|
|  Addition       |                                       |  n^2       |
| Substraction    |                                       | n^2        |
|  Multiplication | Strassen algorithm                    | n^(2,81)   |
|  Determinant    | Doolittle Algorithm  LU Decomposition | n^3        |

### Sources:

Initial sources have mainly been from wikipedia:

- https://en.wikipedia.org/wiki/Computational_complexity_of_mathematical_operations
