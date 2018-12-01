	   LXI H,2060
	   MVI A,00
	   MOV C,M
	   MVI B,01
	   MVI E,01
	   DCR C
	   JZ L4
	   DCR C
	   JZ L4
	   MOV A,B

L2:	   ADD E
	   DCR C
	   JNZ L1
	   STA 2070
	   HLT

L1:	   MOV E,B
	   MOV B,A
	   JMP L2

L4:	   MVI A,01
	   STA 2070
	   HLT
# ORG 2060H
# DB 06
