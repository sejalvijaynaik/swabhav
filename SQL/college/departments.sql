create table departments(
	id int not null primary key,
	name varchar(100),
	college_id int,
	FOREIGN KEY(college_id) REFERENCES colleges(id)
);

desc departments;

insert into departments(id, name, college_id)
values(1, 'computer', 1),
	(2, 'extc', 1),
	(3, 'finance', 2),
	(4, 'marketing', 2);
	
select * from departments;