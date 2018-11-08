create table Employee(
	Emp_ID varchar(10),
	E_name varchar(30),
	E_salary number,
	Mgr_ID varchar(10),
	constraint pk primary key (Emp_ID)
	);

insert into Employee
	values ('EMP001','Jimut Bahan Pal',67440,'');
insert into Employee
	values ('EMP002','Samiran Dey',50000,'EMP001');
insert into Employee
	values ('EMP003','Bodhiswatta Saha',50000,'EMP001');
insert into Employee
	values ('EMP004','Aniket Bhattacharya',967440,'EMP001');
insert into Employee
	values ('EMP005','Nilesh Kundu',167440,'');


insert into Employee
	values ('EMP006','Shreya Banerjee',0,'EMP004');

insert into Employee
	values ('EMP007','Rittik Bose',7440,'EMP005');

insert into Employee
	values ('EMP008','Piu Biswas',4450,'');

select * 
from Employee;

commit;