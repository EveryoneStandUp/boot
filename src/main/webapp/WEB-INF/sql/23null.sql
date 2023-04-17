SELECT * FROM Products ORDER BY 1 DESC;
-- IFNULL : null이면 다른 값으로 변경
SELECT IFNULL(0, 100); -- 0
SELECT IFNULL('kim', 'lee'); -- kim
SELECT IFNULL(NULL, 100); -- 100
SELECT IFNULL(NULL, 'park'); -- park

SELECT ProductID, ProductName, SupplierID, CategoryID,
Unit, Price FROM Products ORDER BY 1 DESC;
SELECT ProductID, ProductName, SupplierID, CategoryID,
Unit, IFNULL(Price, 0) FROM Products ORDER BY 1 DESC;
SELECT ProductID,
	   ProductName,
       SupplierID,
       CategoryID,
	   Unit,
       IFNULL(Price, 0) Price
FROM Products ORDER BY 1 DESC;

SELECT AVG(IFNULL(Price, 0)) AS Average
FROM Products
WHERE CategoryID = 2;
SELECT AVG(Price) AS Average
FROM Products
WHERE CategoryID = 2;

SELECT AVG(Price) AS Average
FROM Products; -- 28.866
SELECT AVG(IFNULL(Price, 0)) AS Average
FROM Products; -- 28.13

-- 고객테이블에서 CustomerID, CustomerName, ContactName, Address 조회
-- ContactName이 NULL이면 'Anonymous'로
-- Address가 NULL이면 'Homeless'로 조회
SELECT CustomerID,
	   CustomerName,
       IFNULL(ContactName, 'Anonymous') ContactName,
       IFNULL(Address, 'Homeless') Address
FROM Customers
ORDER BY 1 DESC;
SELECT * FROM Customers Order BY 1 DESC;




