-- 코드를 입력하세요
SELECT
        A.FLAVOR
FROM 
        FIRST_HALF A, ICECREAM_INFO B
WHERE 
        A.FLAVOR = B.FLAVOR
AND 
        TOTAL_ORDER > 3000
AND     
        INGREDIENT_TYPE = 'fruit_based';