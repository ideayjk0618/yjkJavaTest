-- 동물 보호소에 들어온 동물 중, 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.

SELECT
    ANIMAL_ID
FROM
    ANIMAL_INS
WHERE
    NAME IS NULL
ORDER BY
    ANIMAL_ID;


-- 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.

SELECT
    ANIMAL_ID
FROM
    ANIMAL_INS
WHERE
    NAME IS NOT NULL
ORDER BY
    ANIMAL_ID;


-- 입양 게시판에 동물 정보를 게시하려 합니다. 동물의 생물 종, 이름, 성별 및 중성화 여부를 아이디 순으로 조회하는 SQL문을 작성해주세요.
-- 이때 프로그래밍을 모르는 사람들은 NULL이라는 기호를 모르기 때문에, 이름이 없는 동물의 이름은 No name으로 표시해 주세요.
-- NULL 공백 치환 : NVL 또는 VNL2 함수를 사용한다. NVL(항목이름, 숫자또는'문자') = 해당 항목이 null 인경우에는 그 옆에 있는 숫자또는문자로 치환한다.
-- NVL2(항목이름, 숫자또는'문자'1, 숫자또는'문자'2) = 해당 항목이 null이 아닌경우에는 문자1, null 인경우에는 문자2로 치환한다.

SELECT
    ANIMAL_TYPE
    , NVL(NAME, 'No name') AS NAME
    , SEX_UPON_INTAKE
FROM
    ANIMAL_INS
ORDER BY
    ANIMAL_ID;
