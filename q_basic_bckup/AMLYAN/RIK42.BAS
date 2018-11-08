REM
CLS : C = 1: B = 1: M = 0: N = 0: P = 0
INPUT "ENTER EXTENT"; N
FOR I = 1 TO N
P = M + B
N = B + 1
WHILE (N < P)
PRINT N;
N = N + 1
WEND
M = B
B = P
NEXT I
END

