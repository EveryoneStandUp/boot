USE w3schools;

SELECT lastName, firstName FROM Employees;

SELECT lastName, firstName 
FROM (SELECT lastName, firstName FROM Employees) emp -- from절에서 사용 시 별칭 필요
WHERE lastName >= 'd' AND lastName < 'e';

-- 고객별 소비금액 (가장 많이 구매한 고객 내림차순)
SELECT AVG(구매금액) FROM
(SELECT c.CustomerID, c.CustomerName, SUM(od.Quantity * p.Price) 구매금액
FROM
	Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
			 JOIN Customers c ON o.CustomerID = c.CustomerID
			 JOIN Products p ON od.ProductID = p.ProductID
GROUP BY c.CustomerID
ORDER BY 구매금액 DESC) t1;

-- 직원별 매출액의 평균
SELECT AVG(처리금액) FROM
(SELECT e.EmployeeID, e.LastName, e.FirstName, SUM(od.Quantity * p.Price) 처리금액
FROM Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
			  JOIN Products p ON od.ProductID = p.ProductID
			  JOIN Employees e ON o.EmployeeID = e.EmployeeID
GROUP BY e.EmployeeID
ORDER BY 처리금액 DESC) t2;

SELECT * FROM Products;
SELECT * FROM Categories;
SELECT * FROM Orders;
SELECT * FROM OrderDetails;

-- 카테고리별 평균상품가격 조회 (평균상품가격이 30.00달러 이상인 것만)
SELECT CategoryID, AVG(Price)
FROM Products
GROUP BY CategoryID
HAVING AVG(Price) > 30.00;

SELECT CategoryID, average
FROM
(SELECT CategoryID, AVG(Price) average
FROM Products
GROUP BY CategoryID) T1
WHERE average >= 30.00;

SELECT T1.CategoryID, c.CategoryName, T1.average
FROM
(SELECT CategoryID, AVG(Price) average
FROM Products
GROUP BY CategoryID) T1 JOIN Categories c ON T1.CategoryId = c.CategoryId
WHERE average >= 30.00;








