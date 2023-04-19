-- Character (String 문자형)
-- VARCHAR(길이)
CREATE TABLE MyTable02 (
	Col1 VARCHAR(3),
    Col2 VARCHAR(5)
);
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abc', 'abcde'); -- ok
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('ab', 'abcd'); -- ok 
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abcd', 'abcdef'); -- fail

SELECT * FROM MyTable02;

-- 연습)
-- MyTable03
-- 3개의 컬럼
-- 첫 번째 컬럼 TYPE : 문자열 10개까지 저장가능
-- 두 번째 컬럼 TYPE : 문자열 100개까지 저장가능
-- 세 번째 컬럼 TYPE : 문자열 100개까지 저장가능
CREATE TABLE MyTable03(
	Col1 VARCHAR(10),
	Col2 VARCHAR(100),
	Col3 VARCHAR(1000)
);
DESC MyTable03;

-- Numeric (수)
-- INT 정수형
CREATE TABLE MyTable04(
	Col1 INT
);
DESC MyTable04;
INSERT INTO MyTable04 (Col1) VALUE (33); -- ok
INSERT INTO MyTable04 (Col1)
VALUES (1234567890); -- ok
INSERT INTO MyTable04 (Col1)
VALUES (999999999); -- ok
INSERT INTO MyTable04 (Col1)
VALUES (3.14); -- 소수점 이하 생략
SELECT * FROM MyTable04;

-- 연습) MyTable05 만들기
-- 두개의 컬럼이 모두 정수 저장 가능
CREATE TABLE MyTable05 (
	Col1 INT,
    Col2 INT
);
DESC MyTable05;
INSERT INTO MyTable05
VALUES (120, 150);

-- 최대값 : 2147483647
-- 최소값 : -2147483648
INSERT INTO MyTable05
VALUES (2147483647, -2147483648); -- ok
INSERT INTO MyTable05
VALUES (2147483648, -2147483648); -- fail
SELECT * FROM MyTable05;

-- DEC 실수형
-- DEC(총길이, 소수점이하길이)
CREATE TABLE MyTable06 (
	Col1 DEC(5, 2),
    Col2 DEC(3, 1)
);
DESC MyTable06;
INSERT INTO MyTable06 (Col1) VALUES (999.99); -- ok
INSERT INTO MyTable06 (Col1) VALUES (-999.99); -- ok
INSERT INTO MyTable06 (Col1) VALUES (1000.99); -- fail
INSERT INTO MyTable06 (Col1) VALUES (999.999); -- fail
SELECT * FROM MyTable06;

-- 연습) MyTable07 만들기
-- 두개 컬럼 (실수형), 총길이, 소수점이하길이 직접 작성
CREATE TABLE MyTable07 (
	Col1 DEC(4, 2),
    Col2 DEC(6, 3)
);
INSERT INTO MyTable07 (Col1) VALUES (99.99);
INSERT INTO MyTable07 (Col2) VALUES (999.999);
INSERT INTO MyTable07 (Col1, Col2) VALUES (99.99, 999.999);
DESC MyTable07;
SELECT * FROM MyTable07;

-- 날짜시간
-- DATE 날짜 (YYYY-MM-DD)
-- DATETIME 날짜시간 (YYYY-MM-DD hh:mm:ss)
CREATE TABLE MyTable08 (
	Col1 DATE,
    Col2 DATETIME
);
DESC MyTable08;
INSERT INTO MyTable08 (Col1) 
VALUES ('2023-04-19');
INSERT INTO MyTable08 (Col1)
VALUES ('9999-12-31');
INSERT INTO MyTable08 (Col1)
VALUES ('1000-01-01');

SELECT * FROM MyTable08;
INSERT INTO MyTable08 (Col2)
VALUES ('2023-04-19 11:41:30');
INSERT INTO MyTable08 (Col2)
VALUES ('9999-12-31 23:59:59');
INSERT INTO MyTable08 (Col2)
VALUES ('1000-01-01 00:00:00');

SELECT NOW();

INSERT INTO MyTable08 (Col1, Col2)
VALUES (now(), now());

-- 예제) MyTable09(학생 정보)
-- 학생이름, 성별, 생년월일, 시험성적, 기타정보
CREATE TABLE MyTable09 (
	Name VARCHAR(20),
    Gender VARCHAR(1),
    BirthDate DATE,
    Score DEC(5, 2),
	Extra VARCHAR(1000)
);
INSERT INTO MyTable09 (Name, Gender, BirthDate, Score, Extra)
VALUES ('손흥민', '여', '2000-02-02', 99.99, '축구선수');
SELECT * FROM MyTable09;

-- 연습) 내가 가지고 있는 교재정보 저장 MyTable10
CREATE TABLE MyTable10 (
	Name VARCHAR(20),
    PAGE INT,
    Price INT
);
INSERT INTO MyTable10
VALUES ('정보처리기사', 500, 40000);
SELECT * FROM MyTable10;












