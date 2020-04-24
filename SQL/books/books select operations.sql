show tables;
desc books;
select * from books;

select distinct author_lname from books;

select distinct concat(author_fname, author_lname) from books;

select distinct author_fname, author_lname from books;

select author_lname from books order by author_lname;

select title from books order by title;

select author_lname from books order by author_lname desc;

select released_year from books order by released_year;

select title, released_year, pages from books order by released_year;

select title, released_year, pages from books order by 2;

select author_fname, author_lname from books order by author_lname, author_fname;

select title from books limit 3;

select title, released_year from books order by released_year desc limit 5;

select title, released_year from books order by released_year desc limit 1, 3;

select title, author_fname from books where author_fname like '%da%';

select title, author_fname from books where author_fname like 'da%';

select title from books where title like 'the%';

select title from books where title like '%the%';

select title, stock_quantity from books where stock_quantity like '____';

select title, stock_quantity from books where stock_quantity like '__';

select title from books --where title like "%\%%";

select title from books where title like "%\_%";

select title from books where title like '%stories%';

select title, pages from books order by pages desc limit 1;

select concat(title, ' - ', released_year) as 'summary' from books order by released_year desc limit 3;

select title, author_lname from books where author_lname like '% %';

select title, released_year, stock_quantity from books order by 3 limit 3;

select title, author_lname from books order by author_lname, title;

select upper(concat('my favourite author is ', author_fname, ' ', author_lname)) as 'yell' from books order by author_lname;



