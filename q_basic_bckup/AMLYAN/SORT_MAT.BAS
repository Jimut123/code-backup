10 DIM n(4, 4)
20 FOR i = 1 TO 4
30 FOR j = 1 TO 4
40 INPUT n(i, j)
50 NEXT j
60 NEXT i
70 FOR i = 1 TO 4
80 FOR k = 1 TO 3
90 FOR l = k + 1 TO 4
100 IF n(i, k) > n(i, l) THEN temp = n(i, k): n(i, k) = n(i, l): n(i, l) = temp
110 NEXT l
120 NEXT k
130 NEXT i
140 FOR i = 1 TO 4
150 FOR j = 1 TO 4
160 PRINT n(i, j);
170 NEXT j
180 PRINT
190 NEXT i
200 END



