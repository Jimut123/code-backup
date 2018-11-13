	   MVI D,00	// COUNTS THE SUM
	   LXI H,2060
	   MVI E,10	// COUNTER

L1:	   STC
	   CMC
	   MOV A,M
	   CPI 00
	   JC L2
	   ADD D
	   MOV D,A

L2:	   INX H
	   DCR E
	   JNZ L1
	   STC
	   CMC
	   RAL
	   JC L3
	   RAR
	   STA 2070
	   HLT

L3:	   MVI A,FF
	   STA 2070
	   HLT
# ORG 2060H
# DB -1H,2H,3H,4H,1H,4H,-4H,-5H,-4H,-9H
