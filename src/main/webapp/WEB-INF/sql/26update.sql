-- update : 레코드 수정

SELECT * FROM Customers WHERE CustomerID = 1;
UPDATE Customers			-- 테이블 명
SET CustomerName = '서태웅' -- 변경할 컬럼과 값
WHERE CustomerID = 1;		-- 변경할 레코드의 조건
SELECT * FROM Customers WHERE CustomerID = 1;

UPDATE Customers
SET 						 -- 변경할 컬럼과 값 (,)
	CustomerName = '정대만',
    City = 'Seoul',
    Country = 'Korea'
WHERE CustomerID = 1;

SELECT * FROM Customers WHERE CustomerID = 1;

-- 1번 공급자의 이름, 도시, 나라 변경
SELECT * FROM Suppliers;
UPDATE Suppliers
SET SupplierName = '박호두',
    City = 'Seoul',
    Country = 'Korea'
WHERE SupplierID = 1;
SELECT * FROM Suppliers WHERE SupplierID = 1;
   
SELECT * FROM Suppliers
WHERE Country = 'USA';

UPDATE Suppliers
SET SupplierName = '채치수',
	Country = 'France'
WHERE Country = 'USA';

SELECT * FROM Suppliers WHERE Country = 'France';