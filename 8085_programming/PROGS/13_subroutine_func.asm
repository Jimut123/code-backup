; A program to see the working of functions/subroutines
; Add Reg B + Reg C and store it into 0005H memory location
; Add Reg A + Reg A and store it into 0006H memory location

	MVI A, 05H	; storing of the data to registers
	MVI B, 02H	; storing of the data to registers
	MVI C, 06H	; storing of the data to registers

	CALL label1	; calling function1
	CALL label2	; calling function1

	STA 0006H	; storing the value of 05+05 Reg A + 05H  into 0006H mem loc.

	HLT		; end of the program execution

label1: MOV D, A	; Addition of 2 nos. using function
	PUSH D		; to see the push and pop operations 
	MOV A, C	; Adding 2 nos
	ADD B		
	MVI D, 08H	; intentionally done to check the validity of 
			; push and pop operations in the 8085
			; no. of push = no. of pop inside the subroutine
			; else the PC will not be pointed to the correct location
			; on returning

	STA 0005H	; store the sum to 0005H location
	POP D		; check whether the contents are correctly popped
	MOV A, D
	RET		; return the prog counter

label2: MVI L, 05H
	ADD L		; add 05 H to Reg A
	RET