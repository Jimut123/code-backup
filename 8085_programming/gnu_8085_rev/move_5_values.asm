	   LXI H,2050
	   MVI C,05
	   LXI D,2060

L1:	   MOV A,M
	   STAX D
	   INX H
	   INX D
	   DCR C
	   JNZ L1
	   HLT
# ORG 2050
# DB 20,23,23,56,35
