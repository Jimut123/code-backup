	   LXI H,2060
	   MOV A,M
	   STC
	   CMC
	   CPI 02
	   JC L1
	   ADI 4E

L2:	   STA 2070
	   HLT

L1:	   ADI 48
	   JMP L2
# ORG 2060H
# DB 09H
