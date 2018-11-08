; using of LHLD and SHLD operations

LXI H, 0000H
MVI M, 12H

LXI H, 0001H
MVI M, 34H

LHLD 0000H 	; this copies the contents of 4100H to H and 4101H to L
SHLD 0002H

HLT