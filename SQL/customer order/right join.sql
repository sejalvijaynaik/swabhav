select * from customers right join orders on customers.id = orders.customer_id;

delete from customers where first_name = 'boy';