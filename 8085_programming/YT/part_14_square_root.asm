// To find the square root of a perfect square
	   MVI C,00
	   MVI D,01
	   LXI H,2060
	   MOV A,M
	   INR C
	   SUB D
	   JNZ L1

L2:	   MOV A,C
	   STA 2070
	   HLT

L1:	   INR D
	   INR D
	   INR C
	   SUB D
	   JNZ L1
	   JMP L2
// 1 -> 01H
// 4 -> 04H
// 9 -> 09H
// 16 -> 10H
# ORG 2060H
# DB 10H
