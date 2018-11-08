; To add some consequtive nos. in memory locations
	MVI H, 00H	; the first part/ lower 8 bits
	MVI L, 02H	; the higher 8 bits of M
	MVI B, 06H	; loop counter initialised
	MVI E, 00H 	; E = sum needs to be stored, initialised to 0

label1: MOV A, M	; starting of loop, HL as a pointer
	ADD E		; A = E + A, stored in A
	MOV E, A	; E = A
	INR L		; increment the HL to next location
	MOV A, B	; A = B
	SUI 01H		; decrement the counter, A = A - 1
	MOV B, A	; B = A
	JNZ label1	; ending loop

	MOV A, E	; A = E
	STA 000DH	; store A to 000DH location
	HLT