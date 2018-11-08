
; To directly load 39H in B and 42H in C
; LXI B, 3942H

; load 9D to location 0000H

; LXI H, 0001H
; MVI M, 9DH

; LXI H, 0001H
; MVI A, 9DH
; MOV M, A

HLT