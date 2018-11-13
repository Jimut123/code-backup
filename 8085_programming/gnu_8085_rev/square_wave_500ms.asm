	   MVI A,AA

L3:	   RAR
	   MOV B,A
	   JC L1
	   STC
	   CMC
	   RAR
	   JNC L4
	   MVI A,00
	   OUT 00
	   JMP L2

L1:	   MVI A,01
	   OUT 00
	   JMP L2

L2:	   LXI D,0001

DELAY:	   DCX D
	   MOV A,E
	   ADD D
	   JNZ DELAY
	   STC
	   CMC
	   MOV A,B
	   JMP L3

L4:	   HLT
