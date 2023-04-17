-- DELETE : 테이블의 record(행) 지우기
-- 매우 주의!!!
DELETE 
FROM Customers -- 지울 테이블 명
WHERE CustomerID = 94; -- 지울 레코드의 조건

-- select 먼저 실행 후 delete 할 것
-- 지우기 전 같은 테이블 같은 조건으로 SELECT 하기!
SELECT *
FROM Customers -- 지울 테이블 명
WHERE CustomerID = 94; -- 지울 레코드의 조건

-- 93번 고객 지우기 
SELECT * FROM Customers
WHERE CustomerID = 93;
DELETE
FROM Customers
WHERE CustomerID = 93;
-- 78번 상품 지우기
SELECT * FROM Customers
WHERE ProductID = 73;
DELETE
FROM Products
WHERE ProductID = 78;
-- 79번 상품 지우기
SELECT * FROM Customers
WHERE ProductID = 79;
DELETE
FROM Products
WHERE ProductID = 79;

SELECT * FROM Customers ORDER BY 1 DESC;

-- 
DELETE
FROM Products
WHERE CategoryID = 1;
--
SELECT COUNT(*) FROM Products;

-- 고객 테이블에서 USA에 사는 고객들 지우기
DELETE
FROM Customers
WHERE Country = 'USA';

SELECT COUNT(*) FROM Customers;

-- 모든 직원 지우기
DELETE
FROM Employees;


