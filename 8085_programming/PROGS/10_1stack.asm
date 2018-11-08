MVI D, 05H	; higher 8 bits
MVI E, 08H
PUSH D		; pushes into the stack, first the higher then the lower

MVI H, 03H
MVI L, 02H

PUSH H		; same into the stack into FFFC

POP B
HLT