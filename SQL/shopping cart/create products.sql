create table products(
	id int not null primary key,
	name varchar(100),
	price decimal(13,2)
);

desc products;

select * from products;

insert into products(id, name, price)
values(1, 'top', 500.00),
	(2, 'pant', 600.00),
	(3, 'shirt', 700.00),
	(4, 'shoe', 400.00),
	(5, 'hat', 100.00),
	(6, 'cap', 50.00),
	(7, 'sweater', 600.00),
	(8, 'jeans', 700.00),
	(9, 'socks', 50.00),
	(10, 'watch', 800.00),
	(11, 'boots', 900.00),
	(12, 'earrings', 100.00);

