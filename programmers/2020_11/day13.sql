-- 가장 최근에 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.
-- 별칭을 정해주는것은 AS를 사용하고, ""로 지정해준다.

SELECT
    B.DATETIME AS "시간"
FROM
    (SELECT DATETIME FROM ANIMAL_INS A ORDER BY DATETIME DESC) B
WHERE
    ROWNUM = '1';
