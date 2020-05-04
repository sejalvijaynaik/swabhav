create table line_items(
	id int not null primary key,
	qunatity int,
	order_id int,
	product_id int,
	FOREIGN KEY(order_id) REFERENCES orders(id),
	FOREIGN KEY(product_id) REFERENCES products(id)
);

desc line_items;

drop table line_items;

insert into line_items(id, qunatity, order_id, product_id)
values(1, 2, 1, 2),
	(2, 3, 1, 4),
	(3, 5, 2, 5),
	(4, 3, 2, 7),
	(5, 1, 2, 4),
	(6, 4, 3, 8),
	(7, 3, 4, 9),
	(8, 1, 4, 10),
	(9, 2, 4, 11),
	(10, 3, 4, 1);
	
select * from line_items;
	