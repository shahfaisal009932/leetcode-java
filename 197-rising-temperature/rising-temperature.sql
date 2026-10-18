# Write your MySQL query statement below
select W.id from Weather W join Weather D on datediff(W.recordDate,D.recordDate)=1 and W.temperature>D.temperature;