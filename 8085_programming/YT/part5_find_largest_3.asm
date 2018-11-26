// TO FIND THE LARGEST OF 3 NOS.
	   LDA 2060
	   MOV B,A
	   LDA 2061
	   CMP B
	   JC L1

L2:	   MOV B,A
	   LDA 2062
	   CMP B
	   JC L3

L4:	   STA 2070
	   HLT

L1:	   MOV A,B
	   JMP L2

L3:	   MOV A,B
	   JMP L4
# ORG 2060
# DB 07,32,43
