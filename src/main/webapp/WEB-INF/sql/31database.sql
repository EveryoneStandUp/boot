-- DATABASE(Schema) : 테이블이 있는 곳

-- CREATE DATABASE : database 만들기
CREATE DATABASE mydb;
USE mydb;
CREATE TABLE MyTable11 (
	Title VARCHAR(10),
    Price INT
);

-- DROP DATABASE 데이터베이스 지우기
-- 주의*1000000000000000000
DROP DATABASE mydb;

USE w3schools;

-- mydb1 데이터베이스 만들기
CREATE DATABASE mydb1;
-- mydb1에 새로운 테이블 만들기
CREATE TABLE MyTable12 (
	Title VARCHAR(10),
    Price INT
);
-- mydb1 데이터베이스 삭제하기
DROP DATABASE mydb1;
-- w3schools 데이터베이스 사용하기
USE w3schools;

SELECT * FROM MyTable10; -- 현재 DATABASE
USE test;
SELECT * FROM w3schools.MyTable10; -- 다른 DB























