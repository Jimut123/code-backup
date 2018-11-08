LXI SP, 0010H	; define memory location 0010H as stack pointer
LXI B, 1234H	; B -> 12H and C -> 34H	
LXI D, 5678H	; D -> 56H and E -> 78H
LXI H, 9ABCH	; H -> 9AH and L -> BCH

PUSH B		; to push in the stack
PUSH D		; to push in the stack
PUSH H		; to push in the stack

LXI B, 0000H	; to initialise the registers
LXI D, 0000H	; to initialise the registers
LXI H, 0000H	; to initialise the registers

POP H		; to pop the value and find the value stored in the pair
POP D		; to pop the value and find the value stored in the pair
POP B		; to pop the value and find the value stored in the pair

HLT
