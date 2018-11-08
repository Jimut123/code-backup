LXI H, 0000H
MVI A, 0CDH
MOV M, A
MOV B, M
ANI 0FH
MOV D, A	; D has the least significant bits
MOV A, B

ANI 0F0H

RAR 
RAR 
RAR 
RAR 

MOV E, A	; E has the most significant bit

LXI H, 0001H
MOV M, D
LXI H, 0002H
MOV M, E

HLT