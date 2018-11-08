/*Question 1*/


declare
	empl_no varchar(10);
begin 
	empl_no:=&empl_no;
	update employee set sal=sal*1.1 where emp_no=empl_no;
	commit;
end;
/



/* Question 2 */


declare
	salary number(10);
	empl_no varchar(10);
begin
	empl_no:=&empl_no;
	if salary>=48000 and salary<=69000 then
		update employee set sal=sal*1.2 where emp_no=empl_no;
	elsif salary>69000 and salary<=72000 then
		update employee set sal=sal*1.5 where emp_no=empl_no;
	elsif salary>72000 then
		update employee set sal=sal*1.9 where emp_no=empl_no;
	end if;
	commit;
end;
/














