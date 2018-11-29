	   LXI H,2060
	   MOV A,M
	   MVI C,00
	   INX H
	   MOV B,M

L1:	   SUB B
	   INR C
	   STC
	   CMP B
	   JNC L1
	   STA 2071	// contains the remainder
	   MOV A,C
	   STA 2070	// conatins the quotient
	   HLT
# ORG 2060H
# DB 07H,02H
