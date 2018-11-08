10 DIM n(10)
20 FOR I = 1 TO 10
30 INPUT n(I)
40 NEXT I
50 FOR I = 1 TO 9
60 FOR j = I + 1 TO 10
70 IF n(I) < n(j) THEN temp = n(I): n(I) = n(j): n(j) = temp
80 NEXT j
90 NEXT I
100 FOR I = 1 TO 10
110 PRINT n(I)
120 NEXT I
130 END

