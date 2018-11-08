10 INPUT " A line of text"; t$
20 n = LEN(t$)
30 x$ = ""
40 FOR i = 1 TO n
50 c$ = MID$(t$, i, 1)
60 IF c$ = " " THEN x$ = x$ + " ": GOTO 90
65 a = ASC(c$)
70 IF a >= 65 AND a <= 90 THEN a = a + 32
80 x$ = x$ + CHR$(a)
90 NEXT i
100 PRINT x$
110 END


