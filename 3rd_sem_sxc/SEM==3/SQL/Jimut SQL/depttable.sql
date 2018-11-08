create table Department
	(
		deptno number(1),
		deptname varchar(20),
		location varchar(20),
		constraint dept_pk primary key(deptno),
		constraint dept_no check(deptno in(1,2,3,4)),
		constraint dept_loc check(location in('Kolkata','Bangalore','Pune'))
	);
insert into Department values (1,'Research','Kolkata');
insert into Department values (2,'Marketing','Bangalore');
insert into Department values (3,'Sales','Pune');
insert into Department values (4,'Accounts','Kolkata');