	   MVI C,00	// CONTAINS THE NUMBERS OF 0'S
	   MVI B,00	// CONTAINS THE NUMBERS OF 1'S
	   MVI E,08
	   LXI H,2060
	   MOV A,M

L1:	   STC
	   CMC
	   RAL
	   JC L2
	   INR C

L3:	   DCR E
	   JNZ L1
	   MOV A,B	// 1'S
	   STA 2070
	   MOV A,C	// 0'S
	   STA 2071
	   HLT

L2:	   INR B
	   JMP L3
# ORG 2060H
# DB 44
