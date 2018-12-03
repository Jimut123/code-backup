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
	   ADD C
	   STA 2070
	   HLT
# ORG 2060H
# DB 5FH
