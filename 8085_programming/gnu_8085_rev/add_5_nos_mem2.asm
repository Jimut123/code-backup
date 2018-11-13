; To load the memory with all the contents
	   LXI H,F200
	   MVI B,00
	   MVI C,05
	   MVI A,00

L1:	   MOV D,M
	   ADD D
	   JC L2

L3:	   INX H
	   DCR C
	   JNZ L1
	   STA 0020
	   MOV A,B
	   STA 0021
	   HLT

L2:	   STC
	   CMC
	   INR B
	   JMP L3
#ORG F200
#DB FFH,FFH,FFH,FFH,FFH