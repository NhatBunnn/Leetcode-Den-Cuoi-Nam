-- 175. Combine Two Tables
-- https://leetcode.com/problems/combine-two-tables/?envType=problem-list-v2&envId=database

SELECT p.firstName, p.lastName, a.city, a.state 
FROM Person p
LEFT JOIN address a ON p.personId  = a.personId
