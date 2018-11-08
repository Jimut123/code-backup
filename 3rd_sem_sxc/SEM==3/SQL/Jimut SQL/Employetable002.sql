create table Employee
	(
		empno varchar(7),
		empname varchar(20),
		doj date,
		salary number(10),
		deptname varchar(20),
		constraint emp_pk primary key(empno),
		constraint emp_k check(empno like 'EM%'),
		constraint emp_uk check(deptname in('Marketing','Sales','Accounts','Development','Research'))
	);

insert into Employee values ('EM001','Jimut Bahan Pal','21-Aug-2014',10000,'Research');
insert into Employee values ('EM002','Souvik Gosh','11-Aug-2014',15000,'Development');
insert into Employee values ('EM003','Kingshuk Mukherjee','11-March-2016',20000,'Marketing');
insert into Employee values ('EM004','Bikash Pandey','24-Jan-2004',10000,'Research');
insert into Employee values ('EM005','Bodhiswatta Saha','25-May-2004',16000,'Research');
insert into Employee values ('EM006','Indranil Das','28-Feb-2024',10000,'Research');
insert into Employee values ('EM007','Piu Biswas','11-Aug-2014',60000,'Marketing');
insert into Employee values ('EM008','Rahul Ghandhi','21-Feb-2010',100000,'Marketing');
insert into Employee values ('EM009','Narendra Modi','21-March-2008',130000,'Sales');
insert into Employee values ('EM010','Mamata Banerjee','21-April-2014',140000,'Accounts');
insert into Employee values ('EM011','Annie Hilarian','28-Aug-2006',10000,'Sales');
insert into Employee values ('EM012','Barnali Majumdar','21-Aug-2014',107000,'Accounts');
insert into Employee values ('EM013','Rahul Gupta','21-June-2014',770000,'Development');
insert into Employee values ('EM014','Somiran Dey','21-Aug-2009',100335,'Development');
insert into Employee values ('EM015','Priyadarshi Roy','21-Aug-2014',1000450,'Accounts');
insert into Employee values ('EM016','Akshay Pal','21-Aug-2014',100050,'Development');
insert into Employee values ('EM017','Osama Bin Laden','21-Aug-2014',1670000,'Marketing');


# Who joined in 2011

insert into Employee values ('EM018','Elon Musk','21-Aug-2011',100007000,'Research');
insert into Employee values ('EM019','Mark Zuckerberg','21-June-2011',7089970000,'Development');
insert into Employee values ('EM020','Bill Gates','21-Aug-2011',103450335,'Development');
insert into Employee values ('EM021','Steve Jobs','21-Aug-2011',100034450,'Research');

# to display the table

select * from Employee;

# Now the constraints and test Values That defy the constraints

# This value will not be checked and taken by the SQL ++ editor
# Question 1 since EP is there not EM

insert into Employee values ('EP017','Osama Bin Laden','21-Aug-2014',1670000,'Marketing');

# Question 2 when the employee works in some other department

insert into Employee values ('EP017','Osama Bin Laden','21-Aug-2014',1670000,'Plasma Research');

# Question 3 display the details of the employee who have joined in 2011

select * from Employee where doj like '%11';

# Question 4 display the details of the employee who have worked with Sales Accounts Marketing and erans more than 50,000 pm

select * from Employee where deptname in ('Accounts','Marketing','Sales') and salary >= 50000;


#Display dept and employee nos of all the wmployees whose name starts with S

select deptname,empno from Employee where empname like 'S%';

# Experience of all the employees in years

select empname,round(sysdate-doj,0) "Experience" from Employee;


# Find the no. of employees in the development department

select count (*) "Employee in Development dept" from Employee where deptname in ('Development');

# Increase salary from employees in the Research team

update Employee set salary = salary*1.2 where deptname='Research';

# to delete the records of all the employee whose name ends with H

delete from Employee where empname like '%h';











