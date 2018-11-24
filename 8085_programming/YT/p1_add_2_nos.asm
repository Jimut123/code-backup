	   LXI H,2060
	   MOV A,M
	   INX H
	   MOV B,M
	   ADD B
	   STA 2062
	   HLT
// to store the memory contents
# ORG 2060H
# DB 20H,50H
