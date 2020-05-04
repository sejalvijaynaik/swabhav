create table foo(
	id int,
	description varchar(100)
);

desc foo;

insert into foo(id, description)
values(2, '60'),
	(5, '10'),
	(3, '20'),
	(6, '40'),
	(1, '30'),
	(4, '50');
	
select * from foo;

alter table foo
add primary key(id); 

--non clustered index maintains insertion order
--clustered index maintains ascending order
