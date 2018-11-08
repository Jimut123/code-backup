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



-- To make a table and then add modify parameters to it


-- TO CHECK DUAL

SELECT NEXT_DAY(SYSDATE,'MONDAY')
FROM DUAL;

-----------\

NEXT_DAY
--------
13-11-17

-----------/

CREATE TABLE PRODUCT
(
	PROD_ID NUMBER(10),
	PROD_NAME VARCHAR(10),
	UNIT_PRICE NUMBER(10),
	CONSTRAINT PRODUCT_PK PRIMARY KEY (PROD_ID)
);


-- TO DROP TABLE PRODUCT

DROP TABLE PRODUCT;


-- INSERTING VALUES IN THE TABLE

INSERT INTO PRODUCT
VALUES(1202,'KERNEL',0);


-- TEST -- PRIMARY KEY SHOULD BE UNIQUE

INSERT INTO PRODUCT
VALUES(1202,'MOUSE',0);


-- CONSTRAINT VIOLATED -- CONDITION SATISFIED
--------------------\\

ERROR at line 1:
ORA-00001: unique constraint (JIMUT.PRODUCT_PK) violated


--------------------//


INSERT INTO PRODUCT
VALUES(1021,'PEN DRIVE',300);

INSERT INTO PRODUCT
VALUES(1206,'MOUSE',600);

INSERT INTO PRODUCT
VALUES(1205,'HDD',3400);

INSERT INTO PRODUCT
VALUES(1203,'KEY BOARD',800);


-- TO DISPLAY THE TABLE

SELECT *
FROM PRODUCT;


----------------\



   PROD_ID PROD_NAME  UNIT_PRICE
---------- ---------- ----------
      1202 KERNEL	       0
      1021 PEN DRIVE	     300
      1206 MOUSE	     600
      1205 HDD		    3400
      1203 KEY BOARD	     800


----------------/


-- TO DESCRIBE THE TABLE

DESC PRODUCT;


-------------------\

 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 PROD_ID				   NOT NULL NUMBER(10)
 PROD_NAME					    VARCHAR2(10)
 UNIT_PRICE					    NUMBER(10)


-------------------/


-- TO ALTER THE TABLE


ALTER TABLE PRODUCT
ADD QUANTITY NUMBER(8);



-------------------\

 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 PROD_ID				   NOT NULL NUMBER(10)
 PROD_NAME					    VARCHAR2(10)
 UNIT_PRICE					    NUMBER(10)
 QUANTITY					    NUMBER(8)


-------------------/


-- TO MODIFY THE EXISTING COLUMN BY CHANGING THE PARAMETERS OF THE 
-- ATTRIBUTES

ALTER TABLE PRODUCT
MODIFY UNIT_PRICE NUMBER(11);



----------------------\

 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 PROD_ID				   NOT NULL NUMBER(10)
 PROD_NAME					    VARCHAR2(10)
 UNIT_PRICE					    NUMBER(11)
 QUANTITY					    NUMBER(8)

----------------------/








