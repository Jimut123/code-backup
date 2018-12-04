// TO FIND THE K-TH LARGEST NUMBER WITHOUT SORTING
	   LXI H,2060
	   MVI B,02

L8:	   MVI A,0H
	   LXI H,2060
	   MOV C,M
	   INX H
	   DCR C
	   JZ L4
	   MOV A,M

L3:	   INX H
	   CMP M
	   JC L1

L2:	   STC
	   CMC
	   DCR C
	   JNZ L3
	   MOV E,A
	   LXI H,2060
	   MOV C,M

L5:	   INX H
	   CMP M
	   JZ L6

L7:	   DCR C
	   JNZ L5
	   DCR B
	   JNZ L8
	   MOV A,E
	   STA 2080
	   HLT

L1:	   MOV A,M
	   JMP L2

L4:	   MOV A,M	// IF ONE NUMBER IS PRESENT
	   STA 2080
	   HLT

L6:	   MVI M,0H
	   JMP L7
# ORG 2060H
# DB 04, 05, 06, 03, 01
