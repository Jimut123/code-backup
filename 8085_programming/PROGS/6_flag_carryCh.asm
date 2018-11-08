; AC - Auxialliary Carry is for 4 bits
; C - Carry is the total carry
; Z - Zero is set to 1 since the result is 0
; If there is even no. of 1 bits in the accumulator then it is set to 1
; If there is odd no. of 1 bits then it is set to 0
MVI A, 23H
MOV B,A
MVI A, 0FFH
ADD B
HLT