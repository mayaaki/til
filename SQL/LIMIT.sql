--取得結果が「最大5件」となるようにデータを取得
SELECT *
FROM purchases
LIMIT 5;

--取得結果が「最大10件」となるようにデータを取得
SELECT *
FROM purchases
WHERE character_name = "わんこ"
LIMIT 10;
