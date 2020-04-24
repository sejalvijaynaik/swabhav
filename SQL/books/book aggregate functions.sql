select count(*) from books;

select count(author_fname) from books;

select count(distinct author_fname) from books;

select count(distinct author_fname, author_lname) from books;

select count(*) from books where title like "%the%";

select author_lname, count(*) from books group by author_lname;

select author_fname, author_lname, count(*) from books group by author_lname;

select author_fname, author_lname, count(*) from books group by author_lname, author_fname;

select released_year, count(*) from books group by released_year;

select min(released_year) from books;

select max(pages) from books;

select title, pages from books where pages = (select max(pages) from books);

select author_fname, author_lname, min(released_year) from books group by author_fname, author_lname;

select author_fname, author_lname, max(pages) from books group by author_fname, author_lname;

select sum(pages) from books;

select author_fname, author_lname, sum(pages) from books group by author_fname, author_lname;

select avg(released_year) from books;

select avg(stock_quantity), released_year from books group by released_year;

select author_fname, author_lname, avg(pages) from books group by author_fname, author_lname;

select count(*) from books;

select count(*), released_year from books group by released_year;

select sum(stock_quantity) from books;

select author_fname, author_lname, avg(released_year) from books group by released_year;

select author_fname, author_lname, pages from books order by pages desc limit 1;

select released_year as 'year', count(released_year) as '# books', avg(pages) as 'avg pages' from books group by released_year;