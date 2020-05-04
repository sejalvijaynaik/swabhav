create table orders(
	id int not null primary key,
	No_of_line_items int,
	customer_id int,
	FOREIGN KEY(customer_id) REFERENCES customers(id) 
);

desc orders;

insert into orders(id, No_of_line_items, customer_id)
values(1, 2, 1),
	(2, 3, 1),
	(3, 1, 2),
	(4, 4, 3);
	
select * from orders;