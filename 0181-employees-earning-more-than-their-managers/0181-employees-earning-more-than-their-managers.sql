# Write your MySQL query statement below

# sub-query slow;
# select name as `Employee` from Employee as e where managerid is not null and salary >
# (select salary from Employee where id = e.managerId);

# faster sol
select e1.name AS Employee from Employee e1
join Employee e2
on e1.managerId = e2.id
where e1.salary > e2.salary