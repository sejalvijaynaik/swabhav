show databases;
select database();
show tables;

select * from books;

select author_fname , author_lname from books;

select concat(author_fname, ' ', author_lname) as 'full name' from books;

select concat_ws('-', title, author_fname, author_lname) as 'title-author-name' from books;

select substring(title, 1, 10) as 'short title' from books;

select concat(substring(title, 1, 10), '...') as 'short tilte' from books;

select replace (title, 'e', '3') as title from books;

select substring(replace(title, 'e', '3'), 1, 10) as title from books;

select reverse(title) as 'title' from books;

select concat(author_fname, reverse(author_fname)) as 'title' from books;

select author_fname, char_length(author_fname) as 'name length' from books;

select concat(author_fname, ' is ', char_length(author_fname), ' charachters long') as 'name with length' from books;

select upper(author_fname) as 'name' from books;

select lower(author_fname) as 'name' from books;

select upper(concat('my fav book is ', title)) as 'fav book' from books;

select replace(title, ' ', '->') as 'title' from books;

select author_lname as 'forwards', reverse(author_lname) as 'backwards' from books;

select upper(concat(author_fname, ' ', author_lname)) as 'full name in caps' from books;

select concat(title, ' was released in ', released_year) as 'blurb' from books;

select title, char_length(title) as 'character count'  from books;

select concat(substring(title, 1, 10), '...') as 'short title', concat(author_lname, ',', author_fname) as 'author', concat(stock_quantity, ' in stock') as 'quantity' from books;