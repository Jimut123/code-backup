// PROGRAM TO CONVERT HEXADECIMAL TO DECIMAL
	   LXI H,2060
	   MOV A,M
	   ANI 0F
	   MOV C,A
	   MOV A,M
	   ANI F0
	   RLC
	   RLC
	   RLC
	   RLC
	   MOV B,A
	   STC
	   CMC
	   MOV E,B

L1:	   ADI 0F
	   ADI 06
	   DCR E
	   JNZ L1
	   ADD C
	   DAA
	   STA 2070
	   HLT

# ORG 2060H
# DB 35
