create table Customer(
	cust_id varchar(5),
	cust_name varchar(25),
	cust_city varchar(10),
	constraint c_pk primary key(cust_id)
);
create table Item(
	item_id varchar(5),
	item_name varchar(10),
	unit_price number(5),
	constraint i_pk primary key(item_id)
);
create table Purchase(
	order_no varchar(5),
	cust_id varchar(5),
	item_id varchar(5),
	dop date,
	constraint p_pk primary key(order_no),
	constraint cu_fk foreign key(cust_id) references Customer,
	constraint it_fk foreign key(item_id) references Item
);
---------------------------------------------------------------------
//insertions

insert into customer values('CU001','Deep Ganguly','Kolkata');
insert into customer values('CU002','Ashish Shukla','Durgapur');
insert into customer values('CU003','Rabiul Islam','Asansol');
insert into customer values('CU004','Suranjan Panja','Howrah');
insert into customer values('CU005','Chandrika Bera','Bardhaman');

insert into item values('IT001','Keyboard',5000);
insert into item values('IT002','Aco-Bass',10000);
insert into item values('IT003','Aco-Guitar',6000);
insert into item values('IT004','Ele-Piano',70000);
insert into item values('IT005','Ele-Guitar',80000);
insert into item values('IT006','Cymbal',8000);
insert into item values('IT007','Snare Drum',4000);
insert into item values('IT008','Bass Drum',12000);

insert into purchase values('PR343','CU005','IT006','16-SEP-2014');
insert into purchase values('PR456','CU001','IT001','10-MAY-2015');
insert into purchase values('PR123','CU002','IT004','14-DEC-2017');
insert into purchase values('PR987','CU004','IT003','23-OCT-2016');
insert into purchase values('PR753','CU003','IT007','11-JAN-2016');
insert into purchase values('PR154','CU002','IT002','05-JUL-2015');
insert into purchase values('PR233','CU001','IT005','13-JAN-2015');
insert into purchase values('PR759','CU001','IT001','10-MAY-2015');

-----------------------------------------------------------------------

//queries
select * from customer where cust_id in(select cust_id from purchase where item_id in(select item_id from item where unit_price=(select max(unit_price) from item)));
select * from purchase where to_char(dop,'yyyy')=2015;
select item_name from item where item_id in(select item_id from purchase where cust_id in(select cust_id from customer where cust_city='Durgapur'));
select cust_city "City",count(cust_name) "#Customers" from customer group by cust_city; 
select * from item where item_id in(select item_id from purchase group by item_id having count(*) = (select max(count(*)) from purchase group by item_id));
select * from item where item_id in(select item_id from purchase where cust_id in(select cust_id from customer where cust_name not like 'S%')); 