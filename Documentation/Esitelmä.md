## Esitelmä:

- Matriisit ovat neliömatrsiiseja muotoa NxN

- **Kerronta / Strassen:** https://en.wikipedia.org/wiki/Strassen_algorithm
  - Perusidea: Matrisiia jaetaan neljään osa-alueeseen
  - Osa-alueessa matriisi pienenee kokoon N/2 x N/2
  - Matriisi laajennetaan kokoon 2^n jotta jakaminen onnistuu aina
  - Seitsemän rekursiota
  - Yhdessä rekursiossa yhteen- ja vähennyslaskua: O(N^2)
  
  - T(N) = 7T(N/2) + O(N^2)
  - Masters theorem: T(N) = O(N^log<sub>2</sub>7) = O(N^2,8074)
  
  - Naiivissa olisi kahdeksan rekursiota: O(N^log<sub>2</sub>8) = O(N^3)
  
- **Determinantti / LU - Doolittle:** https://en.wikipedia.org/wiki/LU_decomposition
  - Matriisi jaetaan ala- ja yläkolmiomatriiseihin: A = LU
  - Neliömatriiseille pätee det(LU) = det(L) det(U)
  - Kolmiomatriiseille pätee, että determinantti on diagonaalin tulo
  - Siten det(L) = 1, koska diagonaalit ovat 1. Koko determinantti saadaan siis laskemalla det(U).
  - <https://github.com/tonitomaatti/MatrixCalc/blob/master/MatrixCalc/src/main/java/matrixcalc/domain/Determinant.java>
  
  - Aikavaatimus: O(N^3)
  
- **Aika-analyysiä:** 
  - https://github.com/tonitomaatti/MatrixCalc/blob/master/Documentation/Performance.md
