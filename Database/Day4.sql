-- 182. Duplicate Emails
-- https://leetcode.com/problems/duplicate-emails/?envType=problem-list-v2&envId=database

SELECT email  as Email
FROM Person 
GROUP BY email
HAVING COUNT(*) > 1