
START:	   LXI SP,2000
	   LXI H,2050
	   LXI B,2070
	   MOV A,M
	   CALL BCDBIN
	   STAX B
	   HLT

BCDBIN:	   PUSH B
	   PUSH D
	   MOV B,A
	   ANI 0F
	   MOV C,A
	   MOV A,B
	   ANI F0
	   RRC
	   RRC
	   RRC
	   RRC
	   MOV D,A
	   XRA A
	   MVI E,0A

L1:	   ADD E
	   DCR D
	   JNZ L1
	   ADD C
	   POP D
	   POP B
	   RET
# ORG 2050
# DB 72,52,31
