
L3:	   MVI A,00

L2:	   INR A
	   CPI 09
	   JZ L3

L1:	   MVI B,01
	   DCR B
	   JNZ L1
	   JMP L2
	   HLT
