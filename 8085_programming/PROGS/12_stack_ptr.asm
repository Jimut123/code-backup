MVI H, 00H
MVI L, 0BH
SPHL		; to initialize the stack pointer

MVI D, 05H
MVI E, 08H
PUSH D		; push acc. to the stack ptr, 2 values.

MVI H, 03H
MVI L, 02H

PUSH H		; push the contents of the H-L pair acc. to stack ptr.

POP B		; pop the element of the stack at the B-C pair reg.
HLT
