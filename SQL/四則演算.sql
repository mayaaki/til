-- 「SELECT name, price, 」に追加し、消費税を含んだpriceカラムのデータを取得
SELECT name, price, price * 1.08
FROM purchases;

-- character_nameが「わんこ」であるpriceカラムのデータの合計を取得
SELECT SUM(price)
FROM purchases
WHERE character_name = "わんこ"
;

-- character_nameが「わんこ」であるpriceカラムのデータの平均を取得
SELECT AVG(price)
FROM purchases
WHERE character_name = "わんこ"
;

-- character_nameが「わんこ」であるデータの数を取得
SELECT COUNT(*)
FROM purchases
WHERE character_name = "わんこ"
;
