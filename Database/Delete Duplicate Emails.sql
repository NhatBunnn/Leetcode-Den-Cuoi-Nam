-- 196. Delete Duplicate Emails
-- https://leetcode.com/problems/delete-duplicate-emails/?envType=problem-list-v2&envId=database


-- Với mỗi dòng (row) của bảng 1, SQL sẽ đi so sánh với từng dòng của bảng 2.
-- Nếu cặp dòng nào thỏa mãn điều kiện JOIN (ON ...) thì SQL ghép chúng lại (tức là nối dữ liệu hai dòng thành một dòng mới).
-- Kết quả cuối cùng là tập hợp tất cả các dòng ghép được.

DELETE p1
FROM Person p1
JOIN Person p2
ON p1.Email = p2.Email AND p1.Id > p2.Id;
