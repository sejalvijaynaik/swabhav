create table cats(
	cat_id int NOT NULL auto_increment,
	name varchar(100),
	breed varchar(100),
	age int,
	primary key (cat_id)
);

show tables;

show columns from cats;

desc cats;

drop table cats;
