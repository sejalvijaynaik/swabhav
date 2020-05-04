create table professors(
	id int not null primary key,
	name varchar(100),
	department_id int,
	FOREIGN KEY(department_id) REFERENCES departments(id)
);

desc professors;

insert into professors(id, name, department_id)
values(1, 'sejal', 1),
	(2, 'rachel', 1),
	(3, 'chandler', 2),
	(4, 'joey', 2),
	(5, 'monica', 3),
	(6, 'phoebe', 3),
	(7, 'ross', 4),
	(8, 'gunther', 4);
	
select * from professors;
