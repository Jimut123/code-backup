// 53H = 5H+3H
	   LXI H,2060
	   MOV A,M
	   ANI 0F
	   MOV C,A
	   MOV A,M
	   ANI F0
	   RAR
	   RAR
	   RAR
	   RAR
	   ADD C
	   STA 2061
	   HLT
# ORG 2060
# DB 53
