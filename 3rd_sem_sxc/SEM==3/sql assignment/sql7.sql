/*Question 1*/
declare
	empl_no varchar(10);
begin
	empl_no:=&empl_no;
	update emp set sal=sal*1.1 where emp_no=empl_no;
	commit;
end;
/
/*Question 2*/
declare
	salary number(7);
	empl_no varchar(10);
begin
	empl_no:=&empl_no;
	if salary<1000 then
		update emp set sal=sal*1.1 where emp_no=empl_no;
	elsif salary>=1000 and salary<=2000 then
		update emp set sal=sal*1.07 where emp_no=empl_no;
	else
		update emp set sal=sal*1.05 where emp_no=empl_no;
	end if;
	commit;
end;
/


