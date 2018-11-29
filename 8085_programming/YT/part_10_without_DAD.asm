	   MVI C,00
	   LHLD 2050
	   XCHG
	   LHLD 2052
	   MOV A,L
	   ADD E
	   JC L1

L2:	   STA 2070
	   MOV A,H
	   ADD D
	   JC L3

L4:	   ADD C
	   STA 2071
	   HLT

L1:	   INR C
	   JMP L2

L3:	   MOV B,A
	   MVI A,01
	   STA 2072
	   MOV A,B
	   JMP L4
# ORG 2050H
# DB FFH, FFH, FFH, FFH
