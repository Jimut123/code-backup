	   LXI H,2060	// THE NUMBER OF NUMBERS
	   MOV C,M
	   MVI D,00

L4:	   INX H
	   MOV A,M

L1:	   SUI 02
	   STC
	   CPI 02
	   JNC L1
	   CPI 00
	   JZ L2

L3:	   DCR C
	   JNZ L4
	   MOV A,D
	   STA 2080
	   HLT

L2:	   MOV A,D
	   ADD M
	   MOV D,A
	   JMP L3
# ORG 2060H
# DB 6, 1 , 4 , 3, 1, 2,4
