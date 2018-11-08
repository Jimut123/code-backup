; to store corresponding value and transfer the contents serially in five consequtive memory locations starting 
; from 0000H

MVI A, 01H
MVI B, 02H
MVI C, 03H
MVI D, 04H
MVI E, 05H

MVI H, 00H
MVI L, 00H

MOV M, A
INR L
MOV M, B
INR L
MOV M, C
INR L
MOV M, D
INR L
MOV M, E
INR L

HLT
