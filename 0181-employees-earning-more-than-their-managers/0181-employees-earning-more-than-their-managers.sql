# Write your MySQL query statement below

select name as `Employee` from Employee as e where managerid is not null and salary >
(select salary from Employee where id = e.managerId);