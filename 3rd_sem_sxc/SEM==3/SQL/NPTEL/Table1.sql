--NPTEL COURSE branch table




create table branch(
	bname varchar(15) not null,																	
	bcity varchar(15) not null,
	assets number(10) not null
	);

insert into branch values('Bonhooghly','Kolkata',10000);
insert into branch values('Sarani Square','Mumbai',20000);
insert into branch values('Park Street','Kolkata',50000);
insert into branch values('Dunlop','Kolkata',15000);
insert into branch values('Barasat','Kolkata',16000);



select * 
from branch; 


--NPTEL COURSE customer table


create table customer(
	cname varchar(20) not null,
	ccity varchar(20) not null
	);


insert into customer values ('Jimut Bahan Pal','Kolkata');
insert into customer values ('Bodhiswatta Saha','Kolkata');
insert into customer values ('Debkumar Dasgupta','Mumbai');
insert into customer values ('Ishita Roy Chowdhury','Kolkata');
insert into customer values ('Shreya Banerjee','Kolkata');


select *
from customer;



--NPTEL COURSE account table



create table account(
	ano varchar(10) not null,
	bname varchar(20) not null,
	bal number(10) not null
	);

insert into account values('AC001','Bonhooghly',12800);
insert into account values('AC031','Sarani Square',14500);
insert into account values('AC045','Park Street',15400);
insert into account values('AC087','Dunlop',34800);
insert into account values('AC045','Barasat',56800);
insert into account values('AC041','Bonhooghly',15500);
insert into account values('AC047','Bonhooghly',19000);
insert into account values('AC040','Bonhooghly',18500);
insert into account values('AC039','Bonhooghly',19090);


select * 
from account;



create table loan(
	lno varchar(10) not null,
	bname varchar(20) not null,
	amt number(10) not null
	);

insert into loan values('LN001','Bonhooghly',800);
insert into loan values('LN031','Sarani Square',500);
insert into loan values('LN045','Park Street',400);
insert into loan values('LN087','Dunlop',900);
insert into loan values('LN045','Barasat',800);


select * 
from loan;


--NPTEL course depositor table 


create table depositor(
	cname varchar(20) not null,
	ano varchar(10) not null
	);

insert into depositor values('Jimut Bahan Pal','AC001');
insert into depositor values('Bodhiswatta Saha','AC031');
insert into depositor values('Debkumar Dasgupta','AC045');
insert into depositor values('Ishita Roy Chowdhury','AC087');
insert into depositor values('Shreya Banerjee','AC045');
insert into depositor values('Angana Banerjee','AC078');

insert into depositor values('Tanisha Biswas','AC041');
insert into depositor values('Tejash Datta','AC047');
insert into depositor values('Kanyaka Chackraborty','AC040');
insert into depositor values('Debabrata Dutta','AC039');


select * 
from depositor;



--NPTEL course borrower table 


create table borrower(
	cname varchar(20) not null,
	lno varchar(10) not null
);



insert into borrower values('Jimut Bahan Pal','LN001');
insert into borrower values('Bodhiswatta Saha','LN031');
insert into borrower values('Debkumar Dasgupta','LN045');
insert into borrower values('Ishita Roy Chowdhury','LN087');
insert into borrower values('Shreya Banerjee','LN045');
insert into borrower values('Chandrika Saha','LN097');
insert into borrower values('Kahalima Houtson','LN096');

select *
from borrower;



-- select bname from branch where city = 'Kolkata'

select bname
from branch
where bcity = 'Kolkata';

-- cartesian product of depositor and account

select *
from depositor,account;



select depositor.ano as Dep,bal 
from depositor,account as a
where depositor.ano=account.ano;



select bname
from branch
where assets >= 16000;



------------------------------------Down Query Error -----------------

select t.bname
from branch as t, branch as s
where t.assets > s.assets and s.bname = "Kolkata";


-----------------------------------------------------------------------

select cname
from customer
order by cname desc;


(select cname
from depositor)
union
(select cname
from borrower);


select avg(bal)
from account
where bname='Bonhooghly';


select bname,count(cname)
from depositor,account
where depositor.ano=account.ano
group by bname;


select bname,count(cname)
from depositor,account
where depositor.ano=account.ano
group by bname
having avg(bal)>18000;

select cname
from borrower
where cname
not in (select cname 
		from depositor);

--To find the names of the customer having same account and loan number


select cname
from depositor as D, customer
where D.cname = customer.cname
and cname in
(select cname 
from borrower as B, customer
where B.cname=customer.cname
and B.lno=D.lno);

























