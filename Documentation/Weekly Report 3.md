# Week 3

Time spent: 12 hours

The functionality of the program is basically done. The program can now:
 - Add
 - Substract
 - Multiply (Strassen)
 - Produce a determinant (Doolittle)
 
Next I am going to improve the structure of the project (file structure, logical classes, single responsibility...).

The most advanced java file structure used for now is 2-dimensional array int[][]. Will replace this with my own?

According to jacoco, unit tests are almost 100% for everything but matrixScanner -class (and main). Didn't have time to figure out unit tests for scanner and the class is going to be replaced with more advanced input option anyway.

Program still fails on some obvious cases (like non-square matrices). Will have to implement checks for these.


__Muuta:__

Kurssi on tosiaan suomeksi, mutta kun esimerkki -projektit näyttivät olevan englanniksi niin lähdin kanssa sillä liikenteeseen. Otan tässä kuitenkin tilaisuuden kysyä pari kysymystä jos niihin sattuisi joku vaikka labtoolissa vastaamaan:

 - Compress -projektissa (joka oli annettu esimerkiksi) on toiminnallisuus jaottu osiin domain, io, ui, jne. Onko tästä rakenteesta jollain sivulla ohjetta?
 
 - Tällä hetkellä käytän javan int[][] rakennetta, korvaanko nämä omalla rakenteella? Ohjeessa ei tähän luokkaan suoraan otettu kantaa.
 
PS. Kurssin kotisivujen jotkut linkit ovat rikki. Esimerkiksi viikon kolme kohdalla annettu https://github.com/mluukkai/otm-2018/blob/master/web/koodin_laatuvaatimukset.md ei toimi.
