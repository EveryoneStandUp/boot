DESC Orders;
SELECT * FROM Orders o JOIN Customers c
ON o.CustomerID = c.CustomerID; -- 830
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CustomerID = c.CustomerID; -- 832
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CustomerID = c.CustomerID
WHERE o.OrderID IS NULL; -- 주문한적없는 고객 

-- 주문을 처리한 적 없는 직원 이름 조회
DESC Orders;
SELECT e.LastName, e.FirstName FROM Orders o RIGHT JOIN Employees e
ON o.EmployeeID = e.EmployeeID
WHERE o.OrderID IS NULL;

SELECT * FROM Orders;












