; Program to show the use of the memory
; change the contents of the memory before
; check the reset condition
LDA 0005H	; load the contents of memory addr 0005H to A
MOV B,A		; Move the contents of A to B
LDA 0006H	; A have the contents of the addr 0006H 
ADD B		; Add B with A
STA 000BH	; store the result to memory location 000BH
HLT