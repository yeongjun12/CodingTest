-- 코드를 입력하세요
SELECT
        A.FLAVOR
FROM 
        FIRST_HALF A, ICECREAM_INFO B
WHERE 
        A.TOTAL_ORDER > 3000
AND 
        A.FLAVOR = 'strawberry' OR  A.FLAVOR = 'melon'
GROUP BY A.FLAVOR;