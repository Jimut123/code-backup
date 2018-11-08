create table Employee
	(
		empno varchar(7),
		empname varchar(20),
		doj date,
		salary number(10),
		manager varchar(10),
		deptno number(1),
		constraint emp_pk primary key(empno),
		constraint emp_k check(empno like 'EM%'),
		constraint emp_uk check(deptno in(1,2,3,4)),
		constraint emp_fk foreign key(deptno) references Department
	);

insert into Employee values ('EM001','Jimut Bahan Pal','21-Aug-2014',1000000,NULL,1);
insert into Employee values ('EM002','Indranil Das','22-Aug-2016',10000,'EM001',2);
insert into Employee values ('EM003','Bodhiswatta Saha','22-Sept-2014',10000,'EM001',3);
insert into Employee values ('EM004','Somiron Dey','25-Aug-2014',130000,NULL,1);
insert into Employee values ('EM005','Piu Biswas','21-Aug-2014',19000,'EM004',1);
insert into Employee values ('EM006','Ritam Ray','21-Aug-2015',59000,'EM004',1);
insert into Employee values ('EM007','Bikash Pandey','21-Aug-2014',145000,NULL,4);
insert into Employee values ('EM008','Soumyajit Banerjee','21-Aug-2014',149000,'EM007',4);
insert into Employee values ('EM009','Angana Banerjee','21-Aug-2015',199000,NULL,3);
insert into Employee values ('EM010','Shreya Banerjee','21-Aug-2014',190040,'EM009',3);


# ----------------------------------------------------------------------------------------------------------------------------#
# ----------------------------------------------------------------------------------------------------------------------------#
# ----------------------------------------------------------------------------------------------------------------------------#
# ---------------------------------------------------------- imp ensures data save operation ---------------------------------#
                                                           commit;
# ----------------------------------------------------------------------------------------------------------------------------#
# ----------------------------------------------------------------------------------------------------------------------------#
# ----------------------------------------------------------------------------------------------------------------------------#
# ----------------------------------------------------------------------------------------------------------------------------#
# ----------------------------------------------------------------------------------------------------------------------------#

#Find the details of the employee who are working in Kolkata

#select * from Employee,Department where Employee.deptno = Department.deptno;

select * from Employee,Department where Employee.deptno = Department.deptno and Department.location = 'Kolkata';

# No. od workers working in Pune

select count(*) from Employee,Department where Employee.deptno = Department.deptno and Department.location = 'Pune';


#Display the Employee names along with their manager names
select e.empname,m.empname from Employee e,Employee m where e.manager = m.empno ;

#Find the employee number(s) who are getting a maximum salary

#select empno from Employee where max(salary);

select empno from Employee where salary = (select max(salary) from Employee);

#Find details of the Employees who are working for sales department and have joined in the organization on monday

select * from Employee,Department where Employee.deptno = Department.deptno and Department.deptname = 'Sales' and to_char(Employee.doj,'dy')='Mon';




