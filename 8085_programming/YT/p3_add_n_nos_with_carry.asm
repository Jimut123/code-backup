	   MVI C,09
	   MVI E,00
	   LXI H,2060
	   MOV A,M

L1:	   INX H
	   MOV B,M
	   ADD B
	   JC L2

L3:	   DCR C
	   JNZ L1
	   STA 2070
	   MOV A,E
	   STA 2071
	   HLT

L2:	   INR E
	   STC
	   CMC
	   JMP L3
// to store the memory contents
# ORG 2060H
# DB 01H,03H,01H,01H,01H,01H,01H,02H,F1H,FFH
