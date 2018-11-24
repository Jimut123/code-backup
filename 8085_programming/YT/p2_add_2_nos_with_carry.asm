	   LXI H,2060
	   MOV A,M
	   INX H
	   MOV B,M
	   ADD B
	   STA 2070
	   JC L1

L2:	   HLT

L1:	   MVI A,01
	   STA 2071
	   JMP L2
// to store the memory contents
# ORG 2060H
# DB FFH,FFH
