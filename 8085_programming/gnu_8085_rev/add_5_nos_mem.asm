

	   LXI H,0000H	
	   MVI C,05H
	   MVI A,00H

L1:	   MOV D,M
	   ADD D
	   INX H
	   DCR C
	   JNZ L1
	   STA 0009H
	   HLT
