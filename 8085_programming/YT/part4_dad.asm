	   LXI H,FFFF
	   LXI D,FFFF
	   DAD D
	   SHLD 2700
	   JC L1
	   HLT

L1:	   MVI A,01
	   STA 2702
	   HLT
// ORG 2600
// DB FFH,FFH
