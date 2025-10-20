SELECT w2.id 
FROM Weather w1
JOIN Weather w2
  ON w1.Id = w2.Id - 1
WHERE w2.temperature  > w1.temperature ;
