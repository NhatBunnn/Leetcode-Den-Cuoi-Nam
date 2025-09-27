-- 183. Customers Who Never Order
-- https://leetcode.com/problems/customers-who-never-order/?envType=problem-list-v2&envId=database

SELECT c.name as Customers 
FROM Customers c
LEFT JOIN Orders o
ON c.id = o.customerId
WHERE o.customerId IS NULL