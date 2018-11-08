; MULIPLY 2 nos. using ASSEMBLY
; AUTHOR : JIMUT

LDA 0000H	; STORE THE FIRST NO. in the memory
MOV D, A	; CONTAINS THE A NO. IN D

LDA 0001h	; store the next number in the next memory
MOV E, A	; CONTAINS THE B NO. IN E

MVI B, 00H	; B have the D*E, initializing B

MOV B, D	; B = D	
MOV A, E	; E is the counter, we will decrement E every time
SUI 01H		; E--
MOV E, A	; E = A
MOV A, B	; A = B
label1: ADD D		; a = a + d
	MOV B, A	; b = a
	MOV A, E	; a = e
	SUI 01H		; e = e - 1
	MOV E, A
	MOV A, B	; A = B before going in the next iteration
 	JNZ label1	; loop
MOV A, B
STA 0002H		; store the multiplied no. in 0002H memory
	

HLT