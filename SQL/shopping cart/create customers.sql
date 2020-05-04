create table customers(
	id int not null primary key,
	name varchar(100),
	email varchar(100)
);

desc customers;

insert into customers(id, name, email)
values(1, 'sejal', 'sejal@gmail.com'),
	(2, 'rachel', 'rachel@gmail.com'),
	(3, 'chandler', 'chandler@gmail.com'),
	(4, 'joey', 'joey@gmail.com');
	
select * from customers; 