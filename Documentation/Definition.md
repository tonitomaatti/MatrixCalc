# Project Definition

The aim of the project is to produce a calculator for matrices with basic operations (addition, subtraction, multiplication) and a method for finding the determinant.

### I/O
The calculator takes as input one or two matrices (As simple lists with row length, for example) and wanted operation, and as output produces the result of the operation.

### Algorithms and time complexities

For a matrix size n x n

| Operation       | Algorithm                                | Complexity |
|-----------------|------------------------------------------|------------|
|  Addition       |                                          | n^2        |
|  Substraction   |                                          | n^2        |
|  Multiplication | Strassen algorithm                       | n^(2,81)   |
|  Determinant    | Doolittle Algorithm / LU Decomposition   | n^3        |


- For multiplication, Strassen algorithm is one of the faster ones. A naive algorithm would be n^3.

- For determinant, the matrix is first decomposed to lower and upper triangular matrices by Doolittle algorithm (n^3). The determinant is then simply the product of the diagonal entries. The method follows from two results:
  - For square matrices: det(AB) = det(A) det(B)  (Johdatus lineaarialgebraan, Osa I, Lause 11.13.)
  - The determinant of a triangular matrix is the product of its diagonal entries (Lause 11.11.3.)

- Final data structures to be determined when I'm more familiar with the algorithms. First implementation likely uses int[][] type tables. At least in the case of addition and substraction, the algorithms simply iterate through successive entries. 

### Sources:

Initial sources have mainly been from wikipedia:
- https://en.wikipedia.org/wiki/Computational_complexity_of_mathematical_operations

**For Determinant:**
- https://en.wikipedia.org/wiki/LU_decomposition#Computing_the_determinant
- https://www.geeksforgeeks.org/doolittle-algorithm-lu-decomposition/
- Johdatus lineaarialgebraan, Osa I, Jokke Häsä, Lotta Oinonen, Johanna Rämö
- http://mathonline.wikidot.com/the-algorithm-for-doolittle-s-method-for-lu-decompositions

**For Multiplication:**
- https://stanford.edu/~rezab/classes/cme323/S16/notes/Lecture03/cme323_lec3.pdf
- https://en.wikipedia.org/wiki/Strassen_algorithm
