; A prog to show B-C pair, D-E pair can act as a pointer too

MVI C, 03H	; To store the lower 8 bits of the mem
MVI B, 00H	; To store the higher 8 bits of the mem

LDAX B		; Load Accumulator with pair B
INR A		; Increment the accumulator

MVI D, 00H	; Higher 8 bits
MVI E, 07H	; lower 8 bits

STAX D		; store the value of accumulator in pair D-E
HLT