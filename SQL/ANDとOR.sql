-- categoryカラムが「食費」またはcharacter_nameカラムが「わんこ」であるデータを取得
SELECT *
FROM purchases
WHERE category = "食費"
OR character_name = "わんこ";

-- categoryカラムが「食費」かつcharacter_nameカラムが「ひつじ」であるデータを取得
SELECT *
FROM purchases
WHERE category = "食費"
AND character_name = "ひつじ";
