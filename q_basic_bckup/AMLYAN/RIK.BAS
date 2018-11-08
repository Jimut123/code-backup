REM
CLS
INPUT "ENTER THE NUMBER OF UNITS="; X
IF X <= 75 THEN
C = 0
ELSE
IF X > 75 AND X <= 150 THEN
C = (75 * 0) + ((X - 75) * .5)
ELSE
IF X > 150 AND X <= 225 THEN
C = (75 * 0) + (75 * .5) + ((X - 150) * 1)
ELSE
IF X > 225 AND X <= 300 THEN
C = (75 * 0) + (75 * .5) + (75 * 1) + ((X - 225) * 1.5)
ELSE
IF X > 300 AND X <= 375 THEN
C = (75 * 0) + (75 * .5) + (75 * 1) + (75 * 1.5) + ((X - 300) * 2)
ELSE
IF X > 375 THEN
C = (75 * 0) + (75 * .5) + (75 * 1) + (75 * 1.5) + (75 * 2) + ((X - 375) * 3.5)
END IF
END IF
END IF
END IF
END IF
END IF
PRINT "NET CHARGE="; C
END





