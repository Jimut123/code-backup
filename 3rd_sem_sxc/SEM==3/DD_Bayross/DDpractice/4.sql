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




-- CREATING A TABLE DEPARTMENT

CREATE TABLE DEPARTMENT
(
	DEPT_NO NUMBER(1),
	D_NAME VARCHAR(15),
	LOC VARCHAR(15),
	CONSTRAINT DEPT_PK PRIMARY KEY(DEPT_NO),
	CONSTRAINT DEPT_C CHECK(DEPT_NO IN (1,2,3,4)),
	CONSTRAINT D_NAME_C CHECK(D_NAME IN('MARKETING','SALES','RESEARCH','ACCOUNTS')),
	CONSTRAINT LOC_C CHECK(LOC IN('KOLKATA','BANGALORE','PUNE'))
);

INSERT INTO DEPARTMENT 
VALUES (1,'MARKETING','KOLKATA');

INSERT INTO DEPARTMENT
VALUES (2,'SALES','BANGALORE');

INSERT INTO DEPARTMENT
VALUES (3,'RESEARCH','KOLKATA');

INSERT INTO DEPARTMENT
VALUES (4,'ACCOUNTS','PUNE');




------------------------\

   DEPT_NO D_NAME	   LOC
---------- --------------- ---------------
	 1 MARKETING	   KOLKATA
	 2 SALES	   BANGALORE
	 3 RESEARCH	   KOLKATA
	 4 ACCOUNTS	   PUNE

------------------------/




CREATE TABLE EMPLOYEE
(
	EMP_NO VARCHAR(10),
	EMP_NAME VARCHAR(20),
	DOJ DATE,
	SAL NUMBER(10),
	MNGR VARCHAR(10),
	DEPT_NO NUMBER(1),
	CONSTRAINT EMP_PK PRIMARY KEY(EMP_NO),
	CONSTRAINT EMP_ID CHECK(EMP_NO LIKE 'EM%'),
	CONSTRAINT EMP_FK FOREIGN KEY(DEPT_NO) REFERENCES DEPARTMENT
);

INSERT INTO EMPLOYEE 
VALUES ('EM001','JIMUT BAHAN PAL','22/05/1998',50000,NULL,3);


INSERT INTO EMPLOYEE
VALUES ('EM002','SOUVIK GHOSH','23/07/2013',40000,'EM001',3);

INSERT INTO EMPLOYEE
VALUES ('EM003','BIKASH PANDEY','24/07/2013',45000,'EM001',1);

INSERT INTO EMPLOYEE
VALUES ('EM004','SHRESHTHA SARKAR','22/08/2011',50000,NULL,2);

INSERT INTO EMPLOYEE
VALUES ('EM005','SAMIRAN DEY','04/05/1997',60000,'EM004',4);

INSERT INTO EMPLOYEE
VALUES ('EM006','SOUPTIK MAJUMDER','05/04/2008',70000,NULL,3);

INSERT INTO EMPLOYEE
VALUES ('EM007','ARION MITRA','01/01/2007',80000,'EM006',1);

INSERT INTO EMPLOYEE
VALUES ('EM008','AKASH MANNA','05/04/2013',50000,'EM001',4);




------------------------------\


EMP_NO	   EMP_NAME		DOJ		SAL MNGR	  DEPT_NO
---------- -------------------- -------- ---------- ---------- ----------
EM002	   SOUVIK GHOSH 	23-07-13      40000 EM001		3
EM003	   BIKASH PANDEY	24-07-13      45000 EM001		1
EM004	   SHRESHTHA SARKAR	22-08-11      50000			2
EM005	   SAMIRAN DEY		04-05-97      60000 EM004		4
EM006	   SOUPTIK MAJUMDER	05-04-08      70000			3
EM007	   ARION MITRA		01-01-07      80000 EM006		1
EM008	   AKASH MANNA		05-04-13      50000 EM001		4
EM001	   JIMUT BAHAN PAL	22-05-98      50000			3


------------------------------/



SELECT * 
FROM EMPLOYEE E,DEPARTMENT D
WHERE E.DEPT_NO=D.DEPT_NO
	AND D.LOC='KOLKATA'; 

---------------------\

EMP_NO	   EMP_NAME		DOJ		SAL MNGR	  DEPT_NO
---------- -------------------- -------- ---------- ---------- ----------
   DEPT_NO D_NAME	   LOC
---------- --------------- ---------------
EM002	   SOUVIK GHOSH 	23-07-13      40000 EM001		3
	 3 RESEARCH	   KOLKATA

EM003	   BIKASH PANDEY	24-07-13      45000 EM001		1
	 1 MARKETING	   KOLKATA

EM006	   SOUPTIK MAJUMDER	05-04-08      70000			3
	 3 RESEARCH	   KOLKATA


EMP_NO	   EMP_NAME		DOJ		SAL MNGR	  DEPT_NO
---------- -------------------- -------- ---------- ---------- ----------
   DEPT_NO D_NAME	   LOC
---------- --------------- ---------------
EM007	   ARION MITRA		01-01-07      80000 EM006		1
	 1 MARKETING	   KOLKATA

EM001	   JIMUT BAHAN PAL	22-05-98      50000			3
	 3 RESEARCH	   KOLKATA



---------------------/



-- to count the number of employees in pune

SELECT COUNT(E.EMP_NO) AS TOTAL_EMPLOYEE
FROM DEPARTMENT D, EMPLOYEE E
WHERE D.DEPT_NO=E.DEPT_NO
	AND D.LOC='PUNE';

--------------------\

TOTAL_EMPLOYEE
--------------
	     2


--------------------/





-- TO CALCULATE THE MAX SALARY OF THE EMPLOYEE

 


SELECT MAX(SAL)
FROM EMPLOYEE;




--------------\

 MAX(SAL)
----------
     80000


--------------/




-- TO FIND ALL THE DETAILS OF THE EMPLOYEES WHOSE DOJ = 'MONDAY'



SELECT *
FROM EMPLOYEE E,DEPARTMENT D
WHERE E.DEPT_NO=D.DEPT_NO
AND TO_CHAR(E.DOJ,'DY')='MON';


--------------------------\

EMP_NO	   EMP_NAME		DOJ		SAL MNGR	  DEPT_NO
---------- -------------------- -------- ---------- ---------- ----------
   DEPT_NO D_NAME	   LOC
---------- --------------- ---------------
EM007	   ARION MITRA		01-01-07      80000 EM006		1
	 1 MARKETING	   KOLKATA

EM004	   SHRESHTHA SARKAR	22-08-11      50000			2
	 2 SALES	   BANGALORE



--------------------------/



