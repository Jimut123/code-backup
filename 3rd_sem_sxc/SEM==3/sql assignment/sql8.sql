/*Question 1 - predefined exception*/
declare
	empl_no varchar(10);
	sal1 emp.sal%type;
begin

	empl_no:=&empl_no;
	select sal into sal1 from emp where emp_no=empl_no;
	update emp set sal=sal*1.1 where emp_no=empl_no;
	commit;
	exception
	when no_data_found then
	dbms_output.put_line('No record found');
end;
/
/*--------------------------------------------------------------------------*/
/*Question 2 - user generated exception*/
declare
	salary number(7);
	empl_no varchar(10);
	nullsal exception;
begin
	empl_no:=&empl_no;
	select sal into salary from emp where emp_no=empl_no;
	if salary is null then
	raise nullsal;
	end if;
	if salary<1000 then
		update emp set sal=sal*1.1 where emp_no=empl_no;
	elsif salary>=1000 and salary<=2000 then
		update emp set sal=sal*1.07 where emp_no=empl_no;
	else
		update emp set sal=sal*1.05 where emp_no=empl_no;
	end if;
	commit;
	exception
	when nullsal then
	dbms_output.put_line('NULL SALARY');
	commit;
end;
/