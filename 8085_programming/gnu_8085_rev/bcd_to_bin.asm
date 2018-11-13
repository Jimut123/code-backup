// 72 IN BCD -> 48 IN BINARY
	   LXI H,2050
	   MOV A,M
	   MVI C,09
	   ANI 0F
	   MOV B,A
	   MOV A,M
	   ANI F0
	   RRC
	   RRC
	   RRC
	   RRC
	   MOV D,A

L1:	   ADD D
	   DCR C
	   JNZ L1
	   ADD B
	   OUT 20
	   HLT
# ORG 2050H
# DB 72H
