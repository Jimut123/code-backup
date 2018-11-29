	   LXI H,2060
	   MVI C,00
	   MVI E,01

L2:	   MOV A,M
	   STC
	   CMP E
	   JNC L1
	   MOV A,C
	   STA 2070
	   HLT

L1:	   MOV A,E
	   ADI 02
	   ADD E
	   INR C
	   JMP L2
