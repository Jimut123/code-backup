	   MVI A,00
	   LXI H,2060
	   MVI E,00
	   MVI D,00
	   MVI C,0A

L5:	   MOV A,M
	   CPI 7F
	   JNC L3
	   MOV A,D
	   ADD M
	   MOV D,A
	   JC L2

L3:	   INX H
	   DCR C
	   JNZ L5
	   STA 2070
	   MOV A,E
	   STA 2071
	   HLT

L2:	   INR E
	   STC
	   CMC
	   JMP L3
// DB 80,81,91,01,01,81,F1,01,05,01
# ORG 2060H
# DB 80,34,43,23,87,45,22,84,99,FF
