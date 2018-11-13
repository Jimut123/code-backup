	   MVI B,00

NEXT:	   DCR B
	   MVI C,8C

DELAY:	   DCR C
	   JNZ DELAY
	   MOV A,B
	   OUT 00
	   JMP NEXT
