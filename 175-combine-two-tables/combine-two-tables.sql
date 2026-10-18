# Write your MySQL query statement below
select P.lastName, P.firstName, A.city, A.state from Person P left join  Address A on P.personId = A.personId;