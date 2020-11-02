-- 동물의 아이디와 이름
-- 동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL_ID순으로 조회하는 SQL문을 작성해주세요.
SELECT
  ANIMAL_ID
  , NAME
FROM
  ANIMAL_INS
ORDER BY
  ANIMAL_ID;

-- 여러 기준으로 정렬하기
-- 동물 보호소에 들어온 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회하는 SQL문을 작성해주세요. 단, 이름이 같은 동물 중에서는 보호를 나중에 시작한 동물을 먼저 보여줘야 합니다.
SELECT
    ANIMAL_ID
    , NAME
    , DATETIME
FROM
    ANIMAL_INS
ORDER BY
    NAME ASC
    , DATETIME DESC;
    
-- 상위 n개 레코드
-- 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.
-- SELECT TOP 1 , NAME FROM ANIMAL_INS;
-- 일부 데이터베이스 시스템은 SELECT TOP 절을 지원하지 않습니다. (MS SQL만 가능한거였음.)
-- MySQL은 제한된 수의 레코드를 선택할 수 있는 LIMIT 절을 지원하며 Oracle은 ROWNUM을 사용합니다.

SELECT
    A.NAME
FROM
    (SELECT B.NAME FROM ANIMAL_INS B ORDER BY B.DATETIME) A
WHERE
    ROWNUM = 1;
