DESC MyTable10;
CREATE TABLE MyTable11 (
	NAME VARCHAR(10)
);

-- SHOW CREATE TABLE : 테이블 생성 명령 보기
SHOW CREATE TABLE MyTable10;
CREATE TABLE `MyTable11` (
   `Name` varchar(20) DEFAULT NULL,
   `PAGE` int(11) DEFAULT NULL,
   `Price` int(11) DEFAULT NULL
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 
DESC MyTable10;
DESC MyTable11;

-- 같은 컬럼명, 타입으로 새로운 테이블 만들기
CREATE TABLE MyTable12 AS SELECT * FROM MyTable10;
DESC MyTable12;
SELECT * FROM MyTable12;