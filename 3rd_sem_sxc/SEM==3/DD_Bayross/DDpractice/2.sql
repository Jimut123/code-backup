
------------------ AUTHOR ::  JIMUT BAHAN PAL, ST. XAVIER'S COLLEGE  -------------------------------
--------------------------------###########################-----------------------------------------
--                                                                                                --
--||||||||||||||||||||||||||||||    VI SPECIAL COMMANDS    |||||||||||||||||||||||||||||||||||||||--
--                                                                                                --
--------------------------------###########################-----------------------------------------
--                                                                                                --
--      USE ESC+1G TO MOVE TO LINE NO. 1                                                          --    
--      USE ESC+GG TO MOVE TO THE END OF THE FILE                                                 --
--      USE SHIFT+V TO ENTER TO VISUAL MODE AND SELECT AND DELETE ALL THE REQUIRED NO. OF LINES   --
--                                                                                                --
--------------------------------###########################-----------------------------------------



-- CUSTOMER TABLE

CREATE TABLE CUSTOMER
(
	CUST_ID VARCHAR(8),
	CUST_NAME VARCHAR(20),
	CUST_CITY VARCHAR(20),
	NUMBER_OF_UNITS_PURCHASED NUMBER(9),
	CONSTRAINT CUSTOMER_PK PRIMARY KEY(CUST_ID),
	CONSTRAINT CUSTOMER_ID CHECK(CUST_ID LIKE 'CUST%'),
	CONSTRAINT CUSTOMER_CTY CHECK(CUST_CITY IN ('Asansol','Kolkata','Siliguri','Howrah')),
	CONSTRAINT CUSTOMER_PRCH CHECK(NUMBER_OF_UNITS_PURCHASED >= 5)
);


INSERT INTO CUSTOMER
VALUES('CUST001','JIMUT BAHAN PAL','Kolkata',9);


INSERT INTO CUSTOMER
VALUES('CUST002','BILL GATES','Kolkata',23);


INSERT INTO CUSTOMER
VALUES('CUST003','JACK MA','Howrah',32);


INSERT INTO CUSTOMER
VALUES('CUST004','LINUS TORVALD','Siliguri',12);



INSERT INTO CUSTOMER
VALUES('CUST005','SHRESHTHA SARKAR','Siliguri',8);


INSERT INTO CUSTOMER
VALUES('CUST006','JONATHAN JAMES','Asansol',20);


--------------------------------\

CUST_ID  CUST_NAME	      CUST_CITY 	   NUMBER_OF_UNITS_PURCHASED
-------- -------------------- -------------------- -------------------------
CUST001  JIMUT BAHAN PAL      Kolkata					   9
CUST002  BILL GATES	      Kolkata					  23
CUST003  JACK MA	      Howrah					  32
CUST004  LINUS TORVALD	      Siliguri					  12
CUST005  SHRESHTHA SARKAR     Siliguri					   8
CUST006  JONATHAN JAMES       Asansol					  20

--------------------------------/


-- LET'S VIOLATE SOME RULES AND USE DIFFERENT VALUES IN THE QUERY


-- PRIMARY KEY VIOLATION

INSERT INTO CUSTOMER
VALUES('CUST001','SHRESHTHA SARKAR','Siliguri',8);

-----------------------------\

ERROR at line 1:
ORA-00001: unique constraint (JIMUT.CUSTOMER_PK) violated

-----------------------------/

-- CUSTOMER CITY VIOLATION 

INSERT INTO CUSTOMER
VALUES('CUST007','JONATHAN JAMES','Mazurich',20);


------------------------------\

ERROR at line 1:
ORA-02290: check constraint (JIMUT.CUSTOMER_CTY) violated



------------------------------/

-- PURCHASED ATTRIBUTE VIOLATION


INSERT INTO CUSTOMER
VALUES('CUST007','SHRESHTHA SARKAR','Siliguri',2);

---------------------------\

ERROR at line 1:
ORA-02290: check constraint (JIMUT.CUSTOMER_CTY) violated


---------------------------/


-- CUSTOMER ID VIOLATION

INSERT INTO CUSTOMER
VALUES('CT006','JONATHAN JAMES','Asansol',20);


---------------------------\

ERROR at line 1:
ORA-02290: check constraint (JIMUT.CUSTOMER_ID) violated


---------------------------/



-- TO FIND THE TOTAL NUMBER OF UNITS PURCHASED IN CUSTOMER

SELECT SUM(NUMBER_OF_UNITS_PURCHASED) FROM CUSTOMER;



---------------------\


SUM(NUMBER_OF_UNITS_PURCHASED)
------------------------------
			   104

----------------------/



-- TO SELECT SOME CITIES ACCORDING TO THE CUSTOMER ID


SELECT CUST_ID,CUST_NAME,CUST_CITY,NUMBER_OF_UNITS_PURCHASED
FROM CUSTOMER
WHERE CUST_ID IN('CUST001','CUST004','CUST005');


-------------------------\

CUST_ID  CUST_NAME	      CUST_CITY 	   NUMBER_OF_UNITS_PURCHASED
-------- -------------------- -------------------- -------------------------
CUST001  JIMUT BAHAN PAL      Kolkata					   9
CUST004  LINUS TORVALD	      Siliguri					  12
CUST005  SHRESHTHA SARKAR     Siliguri					   8


-------------------------/


SELECT COUNT(*)
FROM CUSTOMER
WHERE CUST_CITY='Asansol';

-- LETS INSERT SOME VALUES INTO THE RELATION SO AS TO MAKE SOME MORE CUSTOMER FROM ASANSOL



INSERT INTO CUSTOMER
VALUES('CUST007','HARLEY QUINN','Asansol',66);
INSERT INTO CUSTOMER
VALUES('CUST008','dRaGoN-008','Asansol',23);
INSERT INTO CUSTOMER
VALUES('CUST009','SAMIRAN DEY','Asansol',56);
INSERT INTO CUSTOMER
VALUES('CUST010','SOUVIK GHOSH','Asansol',4);
INSERT INTO CUSTOMER
VALUES('CUST011','BIKASH PANDEY','Asansol',56);

INSERT INTO CUSTOMER
VALUES('CUST012','SOUPTIK MAJUMDER','Asansol',100);

INSERT INTO CUSTOMER
VALUES('CUST013','ARION MITRA','Asansol',234);





----------------------------\

CUST_ID  CUST_NAME	      CUST_CITY 	   NUMBER_OF_UNITS_PURCHASED
-------- -------------------- -------------------- -------------------------
CUST001  JIMUT BAHAN PAL      Kolkata					   9
CUST002  BILL GATES	      Kolkata					  23
CUST003  JACK MA	      Howrah					  32
CUST004  LINUS TORVALD	      Siliguri					  12
CUST005  SHRESHTHA SARKAR     Siliguri					   8
CUST006  JONATHAN JAMES       Asansol					  20
CUST007  HARLEY QUINN	      Asansol					  66
CUST008  dRaGoN-008	      Asansol					  23
CUST009  SAMIRAN DEY	      Asansol					  56
CUST011  BIKASH PANDEY	      Asansol					  56
CUST012  SOUPTIK MAJUMDER     Asansol					 100

CUST_ID  CUST_NAME	      CUST_CITY 	   NUMBER_OF_UNITS_PURCHASED
-------- -------------------- -------------------- -------------------------
CUST013  ARION MITRA	      Asansol					 234


----------------------------/


SELECT COUNT(*)
FROM CUSTOMER
WHERE CUST_CITY='Asansol';

---------------------------\

  COUNT(*)
----------
	 7


---------------------------/
