	   LXI H,2060
	   MOV A,M
	   STC
	   CMC
	   RAR
	   XRA M
	   STA 2061
	   HLT
# ORG 2060H
# DB 0A
