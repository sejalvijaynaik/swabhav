select * from customers, orders where customers.id = orders.customer_id;

select first_name, last_name, order_date, amount from customers, orders where customers.id = orders.customer_id;

select * from customers join orders on customers.id = orders.customer_id;

select first_name, last_name, order_date, amount from customers join orders on customers.id = orders.customer_id;

select first_name, last_name, order_date, amount from customers join orders;