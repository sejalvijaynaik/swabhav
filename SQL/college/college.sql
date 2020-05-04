create table colleges(
	id int not null primary key,
	name varchar(100),
	location varchar(100)
);

desc colleges;

insert into colleges(id, name, location)
values(1, 'atharva college', 'malad'),
	(2, 'thakur college', 'kandivali');
	
select * from colleges;