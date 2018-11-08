; To add 5 nos. stored in mem. loc. 2050H onwards and store the outputs in 
; mem loc 2060H

	MVI C, 05H		; counter to store 5 nos.

	MVI H, 20H		; initializing the H-L pair
	MVI L, 50H
	MVI A, 00H

label1: ADD M			; ADDING M to A
	INR L			; incrementing L
	DCR C			; decrementing C
	JNZ label1		; loop

	STA 2060H
	HLT

	