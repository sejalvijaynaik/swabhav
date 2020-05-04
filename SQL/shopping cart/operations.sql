select * from customers
left join orders
on customers.id = orders.customer_id order by orders.id;