-- question 1
declare
n number(2);
r1 todd%rowtype;
r2 teven%rowtype;
begin
for n in 1..10 loop
		if mod(n,2)=0 then
			insert into teven values (n);
		else
			insert into todd values (n);
		end if;
end loop;
commit;
dbms_output.put_line('The odd elements are :');
for r1 in (select * from todd)
loop
	dbms_output.put_line(r1.num);
end loop;
dbms_output.put_line('The even elements are :');
for r2 in (select * from teven)
loop
	dbms_output.put_line(r2.num);
end loop;
end;
/
-- question 2
declare
name varchar(50);
rev varchar(50);
l number(5);
begin
name:=&name;
l:=length(name);
for i in reverse 1..l loop
	rev:= rev || substr(name,i,1);
end loop;
if name = rev then
	dbms_output.put_line('Palindrome');
else
	dbms_output.put_line('Not palindrome');
end if;
end;
/
