-- 가장 최근에 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.
-- 별칭을 정해주는것은 AS를 사용하고, ""로 지정해준다.

SELECT
    B.DATETIME AS "시간"
FROM
    (SELECT DATETIME FROM ANIMAL_INS A ORDER BY DATETIME DESC) B
WHERE
    ROWNUM = '1';

-- 최대값의 문제를 구하는 방법인데 위의 방법은, 이중 select문 (서브쿼리)을 사용하여 출력하는방법이기 때문에 max의 값을 찾아 반환하는 sql을 작성해본다.
-- 아래의 방법은 원하는 항목에 max를 붙여서 해당 열에 최고값을 출력한다.

SELECT
    MAX(DATETIME) AS "시간"
FROM
    ANIMAL_INS;


-- 동물 보호소에 가장 먼저 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT
    MIN(DATETIME) AS "시간"
FROM
    ANIMAL_INS;


-- 동물 보호소에 동물이 몇 마리 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT
    COUNT(ANIMAL_ID) AS "count"
FROM
    ANIMAL_INS;
    
-- 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL 문을 작성해주세요.
-- 이때 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 칩니다.
SELECT
    COUNT(NAME) AS "count"
FROM
    (SELECT DISTINCT NAME FROM ANIMAL_INS B WHERE NAME IS NOT NULL) A;
