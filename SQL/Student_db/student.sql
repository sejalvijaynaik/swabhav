create database student_db;
use student_db;
select database();

create table students(
	student_id int auto_increment primary key,
	name varchar(100),
	age int,
	gender char(1),
	address varchar(100)
);

show tables;
desc students;

insert into students(name, age, gender, address)
values('sejal', 25, 'F', 'goregaon'),
	('ross', 20, 'M', 'malad'),
	('joey', 21, 'M', 'andheri'),
	('chandler', 24, 'M', 'colaba'),
	('monica', 25, 'F', 'churchgate'),
	('phoebe', 22, 'F', 'malad'),
	('rachel', 24, 'F', 'goregaon');
	
select * from students;

update students set age = 20 where student_id = 7;