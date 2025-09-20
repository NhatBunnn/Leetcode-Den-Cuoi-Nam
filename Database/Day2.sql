-- 176. Second Highest Salary
-- https://leetcode.com/problems/second-highest-salary/?envType=problem-list-v2&envId=database

-- scalar subquery (subquery trả về tối đa một giá trị): là bọc 1 query lại
-- và mong đợi nó trả về 1 giá trị duy nhất nếu ko có giá trị thì trả về NULL

SELECT (
    SELECT DISTINCT salary 
    FROM Employee 
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary 