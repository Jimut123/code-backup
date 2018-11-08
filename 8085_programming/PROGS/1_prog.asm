; 8085
; First prog

MVI A, 12H	; move immediate
MVI L, 0A2H	; move immediate, since it is starting with a non numeric value,
		; we have to add 0 before A
HLT