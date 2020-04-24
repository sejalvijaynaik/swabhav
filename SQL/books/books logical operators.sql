select title, released_year from books where released_year != 2017;

select author_fname, author_lname from books where author_lname != 'harris';

select title from books where title not like "w%";

select title, released_year from books where released_year > 2000 order by released_year;

select title, released_year from books where released_year >= 2000 order by released_year;

select title, released_year from books where released_year < 2000 order by released_year;

select title, released_year from books where released_year <= 2000 order by released_year;

select author_lname, title, released_year from books where author_lname = 'eggers' and released_year > 2010;

select author_lname, title, released_year from books where author_lname = 'eggers' and released_year > 2010 and title like "%novel%";

select author_lname, title, released_year from books where author_lname = 'eggers' or released_year > 2010;

select author_lname, title, released_year from books where author_lname = 'eggers' or released_year > 2010 or stock_quantity > 100;

select title, released_year from books where released_year between 2004 and 2015;

select title, released_year from books where released_year not between 2004 and 2015;

select author_lname, title from books where author_lname in ('carver', 'lahiri', 'smith');

select author_lname, title from books where author_lname not in ('carver', 'lahiri', 'smith');

select title, released_year from books where released_year % 2 != 0;

select title, released_year,
	case
		when released_year >=2000 then 'Modern lit'
		else '20th century'
	end as 'genre'
from books;

select title, stock_quantity,
	case 
		when stock_quantity between 0 and 50 then '*'
		when stock_quantity between 51 and 100 then '**'
		else '***'
	end as 'stock'
from books;

select * from books where released_year < 1980;		

select * from books where author_lname in ('eggers', 'chabon');

select * from books where author_lname = 'lahiri' and released_year > 2000;

select * from books where pages between 100 and 200;

select * from books where author_lname like 'c%' or author_lname like 's%';

select *,
	case 
		when title like '%stories%' then 'short stories'
		when title like 'just kids' or title like 'a heartbreaking work%' then 'memoir'
		else 'novel'
	end as 'type'
from books;

select title, author_lname,
	case 
		when count(*) = 1 then concat(count(*), ' book')
		else concat (count(*), ' books')
	end as count
from books group by author_fname, author_lname order by author_lname, author_fname;
