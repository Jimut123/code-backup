LXI H, 21B2H	; store H -> 21H and L -> B2H
XCHG		; exchange DE <-> HL
LXI H, 0F13CH	; H -> 0F1H and L -> 3CH
DAD D		; [H][L] + [D][E] -> [H][L]
SHLD 4492H	; store the result in 4492H

LXI H, 4493H	; H -> 4493H
MOV B, M	; B -> 4493H
DCX H		; H -> H - 1
DCX H		; H -> H - 1
MOV M, B	; M -> 4493H
MVI A, 00H
MVI B, 00H
ADC B		; ADD CARRY + B + ACC -> ACC
DCX H		; decrement H-L pair
MOV M, A	; 
HLT