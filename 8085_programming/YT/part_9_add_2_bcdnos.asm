	   LHLD 2050
	   MOV A,L
	   ADD H
	   DAA
	   STA 2070
	   JC L1
	   HLT

L1:	   MVI A,01
	   STA 2071
	   HLT
# ORG 2050H
# DB 73H, 57H
