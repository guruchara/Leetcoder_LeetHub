/* Write your PL/SQL query statement below */

select name as Customers from customers where customers.id not in (select customerId from orders)

