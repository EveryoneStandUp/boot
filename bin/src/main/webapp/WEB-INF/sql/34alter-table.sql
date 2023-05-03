USE w3schools;
-- ALTER TABLE : 테이블 변경
CREATE TABLE MyTable13 (
	Col1 INT,
    Col2 INT
);

-- 컬럼 추가 ADD COLUMN
ALTER TABLE MyTable13
ADD COLUMN Col3 VARCHAR(10);
DESC MyTable13;
ALTER TABLE MyTable13
ADD Column Col4 DEC(10, 2);
-- 연습 5번째 컬럼 추가
ALTER TABLE MyTable13
ADD Column Col5 DATE;

-- 첫 번째 컬럼으로 추가
ALTER TABLE MyTable13 ADD COLUMN Col6 INT FIRST;
DESC MyTable13;
ALTER TABLE MyTable13 ADD COLUMN Col7 INT FIRST;

-- 중간에 컬럼 추가
ALTER TABLE MyTable13 ADD COLUMN Col8 VARCHAR(9) AFTER Col7;

-- 연습) 첫 번째 컬럼으로 하나 추가
ALTER TABLE MyTable13 ADD COLUMN Col9 INT FIRST;
-- 연습) 컬럼을 중간에 추가
ALTER TABLE MyTable13 ADD COLUMN Col10 DEC(4, 2) AFTER Col6;
DESC MyTable13;








