select * from customers left join orders on  customers.id = orders.customer_id;

select first_name, last_name, order_date, amount from customers left join orders on  customers.id = orders.customer_id;

select first_name, last_name, ifnull(sum(amount), 0) as 'total_spent' 
from customers 
left join orders 
on  customers.id = orders.customer_id 
group by customers.id 
order by 'total_spent';