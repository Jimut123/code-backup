REM
CLS : C = 1: I = 0: J = 1: P = 0
INPUT "ENTER LAST TERM="; N
PRINT I; ",";
PRINT J; ",";
WHILE (C <= N - 2)
P = I + J
PRINT P; ",";
I = J
J = P
C = C + 1
WEND
END


