	   LXI H,2060
	   LXI D,2080
	   MVI C,08
	   MVI B,00

L3:	   MOV A,M
	   INX H
	   ADD B
	   ADD M
	   JC L1
	   MVI B,00

L2:	   INX H
	   STAX D
	   INX D
	   DCR C
	   DCR C
	   JNZ L3
	   MOV A,B
	   MOV M,A
	   HLT

L1:	   MVI B,01
	   JMP L2
# ORG 2060
# DB 57, 32, 51, 13, F0, 0F, FF, FF
