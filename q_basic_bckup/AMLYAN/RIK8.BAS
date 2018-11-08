REM
CLS : T = 1: S = 0: P = 0
DIM A(5)
FOR I = 1 TO 5 STEP 1
A(I) = T
T = T + 1
NEXT I
FOR I = 1 TO 5 STEP 1
P = A(I)
S = (S * 10) + P
NEXT I
PRINT "REQD NO.="; S
END



