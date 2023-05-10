USE Board;
SELECT * FROM Board;
SELECT * FROM Member;

UPDATE Board
SET writer = '111';

ALTER TABLE Board
ADD FOREIGN KEY (writer) REFERENCES Member(id);

SELECT * FROM Member;

-- 권한 테이블
CREATE TABLE MemberAuthority (
	memberId VARCHAR(20) NOT NULL,
    authority VARCHAR(30) NOT NULL,
    FOREIGN KEY (memberId) REFERENCES Member(id),
    PRIMARY KEY (memberId, authority)
);

DESC MemberAuthority;








