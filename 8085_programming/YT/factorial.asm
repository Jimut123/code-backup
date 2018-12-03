	   LXI H,2060
	   MOV A,M
	   MOV E,M
	   MOV D,M
	   DCR D
	   JZ L3	// FOR 1
	   DCR D
	   JZ L4	// FOR 2
	   MOV B,D
	   MOV C,D

L1:	   ADD E
	   DCR C
	   JNZ L1
	   DCR B
	   JNZ L2
	   STA 2070
	   HLT

L2:	   MOV C,B
	   MOV E,A
	   JMP L1

L3:	   MVI A,01
	   STA 2070
	   HLT

L4:	   MVI A,02
	   STA 2070
	   HLT
# ORG 2060H
# DB 01
