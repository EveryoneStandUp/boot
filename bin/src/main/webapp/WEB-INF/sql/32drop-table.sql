USE w3schools;

-- DROP TABLE 테이블 삭제
-- 주의*999999999999999999999

DESC MyTable01;

DROP TABLE MyTable01; -- 주의!!!!!

-- 연습 : MyTable02, MyTable03 테이블 drop
DROP TABLE MyTable02, MyTable03; -- 주의!!!!!

-- TRUNCATE : 테이블 유지, 데이터 삭제
SELECT * FROM MyTable04; 
TRUNCATE MyTable04; -- 주의!!!!!
DESC MyTable04;