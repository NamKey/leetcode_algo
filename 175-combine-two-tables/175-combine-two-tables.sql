# Write your MySQL query statement below
SELECT FirstName, LastName, City, State FROM Person LEFT JOIN ADDRESS ON Person.personId = Address.personId;