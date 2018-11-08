; A program to copy the set of data from memory location
; 2050H to 2060H

	MVI H, 20H
	MVI L, 50H
	MVI B, 20H
	MVI C, 60H
	MVI E, 05H	;counter

label1: MOV A, M
	STAX B
	INR L
	INR C
	DCR E
	JNZ label1
	
	HLT
	
	
	