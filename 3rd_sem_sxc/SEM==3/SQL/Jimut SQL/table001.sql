create table Product
	(
		customer_id varchar(7),
		customer_name varchar(20),
		customer_city varchar(20),
		no_units_purchased number(7),
		constraint customer_pk primary key(customer_id),
		constraint customer_k check(customer_id like 'CUST%'),
		constraint customer_ck check(no_units_purchased >= 5),
		constraint customer_uk check(customer_city in('Kolkata','Asansol','Howrah','Siliguri'))
	);

insert into Product values ('CUST001','Jimut Bahan Pal','Kolkata',65);
insert into Product values ('CUST007','Bikash Pandey','Asansol',45);
insert into Product values ('CUST019','Bodhiswatta Saha','Howrah',75);
insert into Product values ('CUST025','Indranil Saha','Siliguri',85);
insert into Product values ('CUST031','Kingshuk Mukherjee','Kolkata',95);
insert into Product values ('CUST041','Souvik Ghosh','Kolkata',35);
insert into Product values ('CUST081','Priyadarshi Roy','Kolkata',95);
insert into Product values ('CUST031','Anirban Batman','Howrah',595);
insert into Product values ('CUST441','Ritam Ray','Kolkata',645);
insert into Product values ('CUST011','Jonathan Halder','Asansol',75);
insert into Product values ('CUST231','Adityam Ghosh','Kolkata',95);





select * from Product;
select sum(no_units_purchased) from Product;
select * from Product where customer_city = 'Asansol';
select count(*) from Product where CUSTOMER_CITY = 'Asansol';
select * from Product where customer_city ='Kolkata' and no_units_purchased > 10;
select customer_name,customer_city from Product where customer_id in ('CUST001','CUST007','CUST019','CUST025');



