	   LXI H,2060
	   MOV A,M
	   MOV B,M
	   MOV C,M
	   DCR C

L1:	   ADD B
	   DCR C
	   JNZ L1
	   DCR B
	   JNZ L2
	   STA 2070
	   HLT

L2:	   MOV C,B
	   JMP L1
# ORG 2060H
# DB 03
