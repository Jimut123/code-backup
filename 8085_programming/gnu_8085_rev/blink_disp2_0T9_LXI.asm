
L3:	   MVI D,00
	   MOV A,D
	   OUT 20

L2:	   INR D
	   MOV A,D
	   CPI 09
	   JZ L3

L1:	   LXI B,0001
	   DCX B
	   MOV A,C
	   ADD B
	   JNZ L1
	   JMP L2
	   HLT
