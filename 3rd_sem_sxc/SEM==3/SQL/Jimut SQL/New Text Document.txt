/*
*
*
*
       This is from w3 school 
       Written by --- Jimut Bahan Pal
       All SQL syntaxes .... the simple syntax are ignored 

*
*
*
*/


#including the Employee table created before 

select * from Employee;


# To list the distinct values in the table
# As many of the values repeats
# select distinct column_name from Employee

select distinct DEPTNO from Employee;

# select exmaple 
# select column_name from table_name

select EMPNAME from Employee;

# To count the distinct no. of elements

select count(distinct DEPTNO) from Employee;

#To change the heading of the count
#As the heading is of two words so it is enclosed in quotation marks
select count(*) as "Distinct Emp" from (select distinct DEPTNO from Employee);

#To use the like command with the where command

select * from Employee where EMPNO like 'EM0%0';

# The pattern is fed in between the query and the un-defined places are used as %

select * from Employee where EMPNAME like '%y';
select * from Employee where EMPNAME like '%D%%';
select * from Employee where EMPNAME like '%kas%%';


# Between clause

select * from Employee where EMPNO between 'EM001' and 'EM005';

# In clause 

select * from Employee where EMPNO in ('EM001','EM005');
# this thing doesn't works select * from Employee where EMPNO in 'EM001' and 'EM005';

#order by clause
# to order in ascending order of the clause
select * from Employee order by EMPNAME asc;

# to order in descending order of the clause
select * from Employee order by EMPNAME desc;

select * from Employee order by EMPNAME,EMPNO asc;

select * from Employee order by EMPNAME desc , EMPNO asc;

# inserting values in particularly mentioning the entities
# whereas the inserting the values in the whole able is very easy
insert into Employee(EMPNO,EMPNAME,SALARY) values ('EM034','Jimut Bahan Pal',9293844);


select * from Employee where DOJ is NULL;


select * from Employee where DOJ is NOT NULL;

# SQL update statement
# Remember to put the where clause or else the whole row would be updated
update Employee set DOJ ='21-May-14',DEPTNO=4 where EMPNO='EM034';


# Fro this example we have come to notice that the existing values are replaced 
update Employee set DOJ ='21-May-14',DEPTNO=4 where EMPNAME='Jimut Bahan Pal';

# Delete statement 
# Where clause is needed
Delete from Employee where EMPNO='EM034';

#To delete all the records
Delete from Employee;
# or

# This doesnot works Delete * from Employee;

#SELECT TOP 'EM004' * FROM Employee;
#SELECT * FROM Employee LIMIT 'EM003';

# Min and max

select min(EMPNO) from Employee;
select max(EMPNO) from Employee;
# It works for alphanumeric characters also ... not only numeric characters!!!
select max(EMPNAME) from Employee;

# To change the heading


select max(EMPNAME) as EMPNAME from Employee;

# count statement

select count(*) from Employee where EMPNAME > 'EM001';

select * from Employee where EMPNAME > 'EM001';


# Average operator

select avg(SALARY) from Employee;



select sum(SALARY) from Employee;

select * from Employee where EMPNO between 'EM001' and 'EM005' order by EMPNAME;


##select * from Employee where DOJ between #21-AUG-14# and #21-AUG-15#;

select DOJ as "Date of Joining" from Employee;


#Aliases

#select o.DOJ,c.DOJ from Employee as o,Employee as c where c.EMPNAME like 'J%' and o.EMPNAME like 'A%';

#JOINING COMMANDS IN SQL

# SQL innerjoin command

select * from Employee inner join Product on Employee.EMPNAME=Product.CUSTOMER_NAME;

# SQL leftjoin
select * from Employee left join Product on Employee.EMPNAME=Product.CUSTOMER_NAME;

select * from Employee right join Product on Employee.EMPNAME=Product.CUSTOMER_NAME;

select * from Employee full join Product on Employee.EMPNAME=Product.CUSTOMER_NAME;


/*** FEED *******/

create table Dat(date1 varchar(20));
#insert into Dat values (select to_char(sysdate,'hh:mi:ss pm') from dual);
create table time1(time2 timestamp);
insert into time1 values(timestamp);

insert into time1 (timestamp_value) values (TO_TIMESTAMP(:ts_val, 'YYYY-MM-DD HH24:MI:SS'));


insert into time1 (timestamp) values (CURRENT_TIMESTAMP);

#/***/         Can't find the actual ... ... ... ... /***/

#This doesnot works 
SELECT A.CUSTOMER_NAME AS CustomerName1, B.CUSTOMER_NAME AS CustomerName2, A.CUSTOMER_CITY
FROM Customers A, Customers B
WHERE A.CUSTOMER_ID <> B.CUSTOMER_ID
AND A.CUSTOMER_CITY = B.CUSTOMER_CITY
ORDER BY A.CUSTOMER_CITY;

# SQL union operator
# This even rearranges the list in alphabetical order
# For distinct values

SELECT CUSTOMER_NAME FROM Product UNION SELECT EMPNAME FROM Employee;

# For repetitive values use union all
# And this doesn't order by any sort of alphabetical order
SELECT CUSTOMER_NAME FROM Product UNION ALL SELECT EMPNAME FROM Employee;

# SQL group by statement
select EMPNAME from Employee where SALARY >= 20000 group by EMPNAME;

# SQL group by function

SELECT COUNT(CUSTOMER_CITY) FROM Product GROUP BY CUSTOMER_CITY;

SELECT COUNT(CUSTOMER_CITY) FROM Product ORDER BY COUNT(Customer_ID) DESC;


# Having clause

SELECT COUNT(CUSTOMER_NAME) FROM Product GROUP BY CUSTOMER_ID having CUSTOMER_ID > 'CUST031';

# Where exists clause 
# To fill in a sub query
select * from Product where exists (SELECT COUNT(CUSTOMER_CITY) FROM Product GROUP BY CUSTOMER_CITY);



# SQL any and all operators

SELECT NO_UNITS_PURCHASED
FROM Product
WHERE NO_UNITS_PURCHASED = ANY
(SELECT NO_UNITS_PURCHASED FROM Product WHERE NO_UNITS_PURCHASED >= 95);


# SQL all operators
SELECT NO_UNITS_PURCHASED
FROM Product
WHERE NO_UNITS_PURCHASED = ALL
(SELECT NO_UNITS_PURCHASED FROM Product WHERE NO_UNITS_PURCHASED >= 95);

# Copies new value to a new table
/*  SELECT *
INTO newtable [IN externaldb]
FROM oldtable
WHERE condition; */
create table  tabl1(customer_id varchar(7),
		customer_name varchar(20),
		customer_city varchar(20),
		no_units_purchased number(7));


/** Insert into new table, values from old table **/

INSERT INTO  tabl1(customer_id,customer_name,customer_city)
select customer_id,customer_name,customer_city FROM Product;
  
# Some comments
-- This is a single line comment
# also a single line comment

/*
* Ahh this multi line comment 
*
*
*/



/*
*
*
        Now comes server side database creation ... note :: this doesnot works for oracle and other where the database is already 
        mounted ... But works fine for PL SQL
        Make sure you have admin privilege before dropping any database
*
*
*/



# to create database
create database database_name;
# to drop database
drop database database_name;

# creating new table from existing table
# without mentioning the attributes and the form of the table ... it takes the exact values

CREATE TABLE tableu AS SELECT customer_id,customer_name,customer_city FROM Product;--WHERE ....;

# this is used to delete all the records of the table

TRUNCATE TABLE tableu;


# Alter table 
# to add columm to an existing table
# u can change the constraints in an existing table


ALTER TABLE Product ADD column_1 char(5);

#to drop the column of an existing table
alter table Product drop columm_1 ;

# to modify a column using 
ALTER TABLE table_name
MODIFY COLUMN column_name datatype;


# SQL constraints 

# not null constraints
# It will take values which are not null

create table first (
        FirstName varchar(20) NOT NULL,
        age int 
);

insert into first values('Hell Yeah!!!',12);
insert into first values('',12);


create table first (
        FirstName varchar(20) UNIQUE,
        age int 
);

insert into first values('Hell Yeah!!!',12);
# will not take the second value as the name is being repeated
insert into first values('Hell Yeah!!!',12);

#Sometimes the constraints can be set up using a single line of code

CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CONSTRAINT UC_Person UNIQUE (ID,LastName)
);

#alter table first add unique age int;


# the primary key constraint -- which should be unique as well as it should not be null
# If other values are taken then -- this shit will not work

CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (ID)
);


# check constraint in SQL
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CHECK (Age>=18)
);


# the SQL checks the age whether greater than 18 and then does it

# declaring multiple checks in a table

ALTER TABLE Persons
ADD CONSTRAINT CHK_PersonAge CHECK (Age>=18 AND City='Sandnes');

# dropping a check constraints

ALTER TABLE Persons
DROP CONSTRAINT CHK_PersonAge;


# SQL default consraint
# default value will be added if no other value is specified


CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    City varchar(255) DEFAULT 'Sandnes'
);

# system values can also be taken and addd to the table

CREATE TABLE Orders (
    ID int NOT NULL,
    OrderNumber int NOT NULL,
    OrderDate date DEFAULT GETDATE()
);



# http://www.sxccal.edu/sxcStaff/pf.asp?msg=Invalid%20user
# check here in sxc u will get a loop hole 
# SQL injection
uName = getRequestString("username");
uPass = getRequestString("userpassword");

sql = 'SELECT * FROM Users WHERE Name ="' + uName + '" AND Pass ="' + uPass + '"'




