DECLARE SUB add ()
DECLARE SUB subt ()
INPUT a
INPUT b
IF a = 1 THEN
add
ELSE
subt
END IF
END

SUB add
INPUT d
INPUT e
c = d + e
PRINT c
END SUB

SUB subt
INPUT t
INPUT q
r = t - q
PRINT r
END SUB

