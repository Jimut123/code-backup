
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




-- creating a new table employee

-- EMPLOYEE TABLE

CREATE TABLE EMPLOYEE
(
	EMP_NO VARCHAR(10),
	EMP_NAME VARCHAR(20),
	DOJ DATE,
	SALARY NUMBER(6),
	DEPT_NAME VARCHAR(20),
	CONSTRAINT EMP_PK PRIMARY KEY(EMP_NO),
	CONSTRAINT EMP_PKC CHECK(EMP_NO LIKE 'EM%'),
	CONSTRAINT DEPT_CONSTRAINT CHECK(DEPT_NAME IN('MARKETING','SALES','RESEARCH','DEVELOPMENT','ACCOUNTS'))
);


INSERT INTO EMPLOYEE
VALUES ('EM001','JIMUT BAHAN PAL','22/05/1998',90000,'RESEARCH');


INSERT INTO EMPLOYEE
VALUES ('EM002','SAMIRAN DEY','22/05/2003',50000,'DEVELOPMENT');

INSERT INTO EMPLOYEE
VALUES ('EM003','SHRESHTHA SARKAR','10/04/2013',90000,'RESEARCH');

INSERT INTO EMPLOYEE
VALUES ('EM004','ADITYA GUPTA','19/05/2010',80000,'ACCOUNTS');

INSERT INTO EMPLOYEE
VALUES ('EM005','SOUVIK GHOSH','17/09/2009',69000,'SALES');

INSERT INTO EMPLOYEE
VALUES ('EM006','BIKASH PANDEY','09/09/2009',100000,'DEVELOPMENT');

INSERT INTO EMPLOYEE
VALUES ('EM007','ARION MITRA','07/09/2013',130000,'RESEARCH');

INSERT INTO EMPLOYEE
VALUES ('EM008','SOUPTIK MAJUMDER','04/08/2015',900000,'RESEARCH');

INSERT INTO EMPLOYEE
VALUES ('EM009','RISHAB TIWARI','24/06/2011',98000,'MARKETING');

INSERT INTO EMPLOYEE
VALUES ('EM010','JONATHAN HALDER','19/03/2012',89993,'SALES');

---------------------------\

EMP_NO	   EMP_NAME		DOJ	     SALARY DEPT_NAME
---------- -------------------- -------- ---------- --------------------
EM001	   JIMUT BAHAN PAL	22-05-98      90000 RESEARCH
EM002	   SAMIRAN DEY		22-05-03      50000 DEVELOPMENT
EM003	   SHRESHTHA SARKAR	10-04-13      90000 RESEARCH
EM004	   ADITYA GUPTA 	19-05-10      80000 ACCOUNTS
EM005	   SOUVIK GHOSH 	17-09-09      69000 SALES
EM006	   BIKASH PANDEY	09-09-09     100000 DEVELOPMENT
EM007	   ARION MITRA		07-09-13     130000 RESEARCH
EM008	   SOUPTIK MAJUMDER	04-08-15     900000 RESEARCH
EM009	   RISHAB TIWARI	24-06-11      98000 MARKETING
EM010	   JONATHAN HALDER	19-03-12      89993 SALES

---------------------------/




-- TO FIND THE EMPLOYEES DETAILS WHO HAVE JOINED IN 2011

SELECT TO_CHAR(DOJ,'YYYY') FROM EMPLOYEE;


-----------------\

TO_C
----
1998
2003
2013
2010
2009
2009
2013
2015
2011
2012


-----------------/

SELECT * FROM EMPLOYEE
WHERE TO_CHAR(DOJ,'YYYY')=2011;


------------------\

EMP_NO	   EMP_NAME		DOJ	     SALARY DEPT_NAME
---------- -------------------- -------- ---------- --------------------
EM009	   RISHAB TIWARI	24-06-11      98000 MARKETING


-------------------/



-- TO SELECT * FROM EMPLOYEE ACCORDING TO SPECIFIC DATES

SELECT * FROM EMPLOYEE
WHERE TO_CHAR(DOJ,'DD')=22;

------------------------\

EMP_NO	   EMP_NAME		DOJ	     SALARY DEPT_NAME
---------- -------------------- -------- ---------- --------------------
EM001	   JIMUT BAHAN PAL	22-05-98      90000 RESEARCH
EM002	   SAMIRAN DEY		22-05-03      50000 DEVELOPMENT


-------------------------/

SELECT * FROM EMPLOYEE
WHERE TO_CHAR(DOJ,'MM') IN('05','06','09');


----------------------\

EMP_NO	   EMP_NAME		DOJ	     SALARY DEPT_NAME
---------- -------------------- -------- ---------- --------------------
EM001	   JIMUT BAHAN PAL	22-05-98      90000 RESEARCH
EM002	   SAMIRAN DEY		22-05-03      50000 DEVELOPMENT
EM004	   ADITYA GUPTA 	19-05-10      80000 ACCOUNTS
EM005	   SOUVIK GHOSH 	17-09-09      69000 SALES
EM006	   BIKASH PANDEY	09-09-09     100000 DEVELOPMENT
EM007	   ARION MITRA		07-09-13     130000 RESEARCH
EM009	   RISHAB TIWARI	24-06-11      98000 MARKETING


----------------------/

SELECT * FROM EMPLOYEE
WHERE DEPT_NAME IN ('SALES','MARKETING','ACCOUNTS') 
		AND SALARY >60000;

-----------------------\


EMP_NO	   EMP_NAME		DOJ	     SALARY DEPT_NAME
---------- -------------------- -------- ---------- --------------------
EM004	   ADITYA GUPTA 	19-05-10      80000 ACCOUNTS
EM005	   SOUVIK GHOSH 	17-09-09      69000 SALES
EM009	   RISHAB TIWARI	24-06-11      98000 MARKETING
EM010	   JONATHAN HALDER	19-03-12      89993 SALES


-----------------------/


SELECT EMP_NAME,EMP_NO FROM EMPLOYEE
WHERE EMP_NAME LIKE('S%');

------------------\

EMP_NAME	     EMP_NO
-------------------- ----------
SAMIRAN DEY	     EM002
SHRESHTHA SARKAR     EM003
SOUVIK GHOSH	     EM005
SOUPTIK MAJUMDER     EM008


------------------/

-- TO CALCULATE THE EXPERIENCE IN YEARS


SELECT EMP_NAME , ROUND(months_between(sysdate,doj)/12) AS EXPERIENCE
FROM EMPLOYEE;



-------------------------\


EMP_NAME	     EXPERIENCE
-------------------- ----------
JIMUT BAHAN PAL 	     19
SAMIRAN DEY		     14
SHRESHTHA SARKAR	      5
ADITYA GUPTA		      7
SOUVIK GHOSH		      8
BIKASH PANDEY		      8
ARION MITRA		      4
SOUPTIK MAJUMDER	      2
RISHAB TIWARI		      6
JONATHAN HALDER 	      6


-------------------------/


SELECT * 
FROM EMPLOYEE
WHERE DEPT_NAME='DEVELOPMENT'; 


-----------------------\

EMP_NO	   EMP_NAME		DOJ	     SALARY DEPT_NAME
---------- -------------------- -------- ---------- --------------------
EM002	   SAMIRAN DEY		22-05-03      50000 DEVELOPMENT
EM006	   BIKASH PANDEY	09-09-09     100000 DEVELOPMENT


-----------------------/



UPDATE EMPLOYEE
SET SALARY=SALARY*.20
WHERE DEPT_NAME='RESEARCH';



------------------------\

EMP_NO	   EMP_NAME		DOJ	     SALARY DEPT_NAME
---------- -------------------- -------- ---------- --------------------
EM001	   JIMUT BAHAN PAL	22-05-98      18000 RESEARCH
EM002	   SAMIRAN DEY		22-05-03      50000 DEVELOPMENT
EM003	   SHRESHTHA SARKAR	10-04-13      18000 RESEARCH
EM004	   ADITYA GUPTA 	19-05-10      80000 ACCOUNTS
EM005	   SOUVIK GHOSH 	17-09-09      69000 SALES
EM006	   BIKASH PANDEY	09-09-09     100000 DEVELOPMENT
EM007	   ARION MITRA		07-09-13      26000 RESEARCH
EM008	   SOUPTIK MAJUMDER	04-08-15     180000 RESEARCH
EM009	   RISHAB TIWARI	24-06-11      98000 MARKETING
EM010	   JONATHAN HALDER	19-03-12      89993 SALES


------------------------/



DELETE FROM EMPLOYEE
WHERE EMP_NAME LIKE('%H');




------------------------\



EMP_NO	   EMP_NAME		DOJ	     SALARY DEPT_NAME
---------- -------------------- -------- ---------- --------------------
EM001	   JIMUT BAHAN PAL	22-05-98      18000 RESEARCH
EM002	   SAMIRAN DEY		22-05-03      50000 DEVELOPMENT
EM003	   SHRESHTHA SARKAR	10-04-13      18000 RESEARCH
EM004	   ADITYA GUPTA 	19-05-10      80000 ACCOUNTS
EM006	   BIKASH PANDEY	09-09-09     100000 DEVELOPMENT
EM007	   ARION MITRA		07-09-13      26000 RESEARCH
EM008	   SOUPTIK MAJUMDER	04-08-15     180000 RESEARCH
EM009	   RISHAB TIWARI	24-06-11      98000 MARKETING
EM010	   JONATHAN HALDER	19-03-12      89993 SALES



------------------------/





