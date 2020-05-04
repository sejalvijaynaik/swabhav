create table birthday_dates(
	id int not null auto_increment primary key,
	name varchar(100),
	birthday date
);

desc birthday_dates;

insert into birthday_dates(name, birthday)
values('sejal', '1994-11-15'),
	('rachel', '2000-03-23'),
	('ross', '1989-10-04'),
	('monica', '2005-08-25');
	
select * from birthday_dates;

DELIMITER $$
CREATE FUNCTION getDate(
	birthday_date date
)
RETURNS varchar(8)
DETERMINISTIC
BEGIN
 DECLARE formatted_date VARCHAR(8);
 set formatted_date = DATE_FORMAT(birthday_date, '%d-%m-%y');
 return formatted_date;
END $$
DELIMITER ;

select *, getDate(birthday) from birthday_dates;