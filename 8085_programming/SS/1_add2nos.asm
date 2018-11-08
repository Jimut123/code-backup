; 1. to load 2 hexadecimal no. in A and C and display the output to
; reg B

MVI A, 32H
MVI C, 48H
ADD C
MOV B, A
HLT