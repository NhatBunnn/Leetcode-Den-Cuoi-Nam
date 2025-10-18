-- 196. Delete Duplicate Emails
-- https://leetcode.com/problems/delete-duplicate-emails/?envType=problem-list-v2&envId=database

DELETE p1
FROM Person p1
JOIN Person p2
ON p1.Email = p2.Email AND p1.Id > p2.Id;
