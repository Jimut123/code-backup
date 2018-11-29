	   LXI H,2060
	   MOV A,M
	   INX H
	   MOV B,M
	   DCR B
L1:	   ADD A
	   DCR B
	   JNZ L1
	   STA 2070
	   HLT
# ORG 2060H
# DB 05H,02H
