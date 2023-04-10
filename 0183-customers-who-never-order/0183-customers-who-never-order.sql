# Write your MySQL query statement below

select c.name as Customers from Customers as c
left join Orders as o
on c.id = o.customerId 
where o.customerId is null;

# other sol 1
# SELECT A.Name from Customers A
# WHERE NOT EXISTS (SELECT 1 FROM Orders B WHERE A.Id = B.CustomerId)

# other sol 2
# SELECT A.Name from Customers A
# WHERE A.Id NOT IN (SELECT B.CustomerId from Orders B)