; to store ABH in mem location 0000H, transfer the data to register B. Then transfer the data to location 0002H

LXI H, 0000H	; to initialize the HL pair by the 0000H
MVI M, 0ABH	; to store 0ABH in the memory location

MOV B, M	; to move the memory contents to Reg B
LXI H, 0002H
MOV M, B
HLT
