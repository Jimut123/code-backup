	   MVI A,64
	   LXI H,2050
	   MOV B,M
	   STC
	   CMP B
	   JNC L2
	   HLT

L2:	   STA 2070
	   HLT
# ORG 2050
# DB 64H
