CREATE TABLE Engineer
(
	e_id VARCHAR(20) NOT NULL,
	e_name VARCHAR(20) NOT NULL,
	doj DATE NOT NULL,
	city CHAR(20) NOT NULL,
	CONSTRAINT Engineer_pk PRIMARY KEY(e_id)
);

CREATE TABLE Client
(
	client_id VARCHAR(20) NOT NULL,
	client_name VARCHAR(20) NOT NULL,
	country CHAR(20) NOT NULL,
	CONSTRAINT Client_pk PRIMARY KEY(client_id)
);

CREATE TABLE Project
(
	p_name VARCHAR(20) NOT NULL,
	iod DATE NOT NULL,
	client_id VARCHAR(20) NOT NULL,
	manager_id VARCHAR(20) NOT NULL,
	CONSTRAINT Project_pk PRIMARY KEY(p_name),
	CONSTRAINT pfk1 FOREIGN KEY(client_id) REFERENCES Client,
	CONSTRAINT pfk2 FOREIGN KEY(manager_id) REFERENCES Engineer
);

CREATE TABLE Assigned
(
	p_name VARCHAR(20) NOT NULL,
	e_id VARCHAR(20) NOT NULL,
	CONSTRAINT Assigned_pk PRIMARY KEY(p_name,e_id),
	CONSTRAINT afk1 FOREIGN KEY(p_name) REFERENCES Project,
	CONSTRAINT afk2 FOREIGN KEY(e_id) REFERENCES Engineer
);
INSERT INTO Engineer
VALUES('ENG_001','Sal Hudson','23-MAY-11','Texas');
INSERT INTO Engineer
VALUES('ENG_002','Mike Tyson','16-NOV-17','California');
INSERT INTO Engineer
VALUES('ENG_003','Kirk Hammet','02-JAN-15','New York');
INSERT INTO Engineer
VALUES('ENG_004','Ted Hopkins','15-OCT-16','Melbourne');
INSERT INTO Engineer
VALUES('ENG_005','Mike Scott','28-SEP-12','Sydney');
INSERT INTO Engineer
VALUES('ENG_006','Trini Hart','23-MAR-17','Los Angeles');
INSERT INTO Engineer
VALUES('ENG_007','Kal Hudson','23-MAY-06','Albama');
 
INSERT INTO Client
VALUES('CL_001','Marv Hoppin','US');
INSERT INTO Client
VALUES('CL_002','Mark Hopper','UK');
INSERT INTO Client
VALUES('CL_003','Sarah Scott','AUS');
INSERT INTO Client
VALUES('CL_004','Selena Mart','AUS');
INSERT INTO Client
VALUES('CL_005','Kim Hart','US');

 
 
INSERT INTO Project
VALUES('Building Const','14-JUL-16','CL_005','ENG_003');
INSERT INTO Project
VALUES('Bridge Const','14-NOV-17','CL_002','ENG_001');
INSERT INTO Project
VALUES('Data Science','18-AUG-11','CL_003','ENG_004');
 
INSERT INTO Assigned 
VALUES('Building Const','ENG_003');
INSERT INTO  Assigned
VALUES('Bridge Const','ENG_001');
INSERT INTO Assigned
VALUES('Data Science','ENG_004');
INSERT INTO Assigned
VALUES('Data Science','ENG_007');

//1
SELECT proj_name 
FROM Assigned  
GROUP BY proj_name 
HAVING count(*)=
(
	SELECT max(count(*)) 
	FROM Assigned 
	GROUP BY proj_name
);
 
//2
SELECT e.*
FROM Engineer e, Project p, Client c
WHERE c.country='AUS'
AND e.e_id=p.manager_id
AND c.client_id=p.client_id;
 
 
//3
SELECT e.*
FROM Engineer e, Project p, Assigned a
WHERE 

//4
SELECT manager_id, round(months_between(CURRENT_DATE,iod),0)
FROM Project;
 
//5
SELECT e.*
FROM Engineer e, Project p, Assigned a
WHERE e.doj>p.iod
AND e.e_id=a.e_id
AND p.p_name=a.p_name;

//6
SELECT *
FROM Engineer 
WHERE e_id NOT IN
(
	SELECT e_id
	FROM Assigned
);

//7
SELECT p.*
FROM Engineer e, Project p, Assigned a
WHERE e.e_id=a.e_id
AND p.p_name=a.p_name
AND e.doj=
(
	SELECT min(doj)
	FROM Engineer
);

//8
SELECT country
FROM Client
GROUP BY country
HAVING COUNT(*) =
(
	SELECT MAX(COUNT(*))
	FROM Client
	GROUP BY country
);

