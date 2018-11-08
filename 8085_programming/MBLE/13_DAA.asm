; Add two decimal numbers and find the result in decimal form

MVI A, 03H
MVI B, 09H

ADD ;B
DAA
MOV C, A
HLT
