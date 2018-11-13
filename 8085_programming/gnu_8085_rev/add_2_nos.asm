	   MVI A,32H
	   MVI C,48H
	   ADD C
	   LXI H,0012H
	   MOV M,A
	   OUT 20H
	   HLT
	
