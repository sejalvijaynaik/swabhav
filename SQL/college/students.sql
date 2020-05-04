create table students(
	id int not null primary key,
	name varchar(100),
	professor_id int,
	FOREIGN KEY(professor_id) REFERENCES professors(id)
);

desc students;

insert into students(id, name, professor_id)
values(1, 'beyonce', 1),
	(2, 'shakira', 1),
	(3, 'rihanna', 2),
	(4, 'jennifer', 2),
	(5, 'britney', 3),
	(6, 'enimen', 3),
	(7, 'ariana', 4),
	(8, 'miley', 4),
	(9, 'taylor', 5),
	(10, 'selena', 5),
	(11, 'demi', 6),
	(12, 'jayz', 6),
	(13, 'kayne', 7),
	(14, 'konshens', 7),
	(15, 'yoyo', 8),
	(16, 'badshah', 8);
	
select * from students;