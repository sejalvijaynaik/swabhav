create table bar(
	id int not null auto_increment primary key,
	name varchar(100)
);

desc bar;

delimiter $$
create trigger before_name_upper
before insert 
on bar for each row
begin 
set new.name = upper(new.name);
end;
delimiter ;

drop trigger before_name_upper;

insert into bar(name)
values('sejal');

insert into bar(name)
values('sejal'),
	('abc'),
	('xyz');

select * from bar;

delete from bar;

drop table bar;

