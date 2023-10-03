-- purchased_atごとのお金を使った数を取得

SELECT COUNT(price),  purchased_at
FROM purchases
GROUP BY purchased_at
;

-- purchased_atごとの合計金額を取得

SELECT SUM(price), purchased_at
FROM purchases
GROUP BY purchased_at
;

-- purchased_atとcharacter_nameごとの合計金額を取得

SELECT SUM(price), purchased_at, character_name
FROM purchases
GROUP BY purchased_at, character_name
;

-- purchased_atとcharacter_nameごとにお金を使った回数を取得

SELECT COUNT(*), purchased_at, character_name
FROM purchases
GROUP BY purchased_at, character_name
;

-- WHEREに条件を付け足してcharacter_nameがわんこであるデータを取得し、グループ化

SELECT SUM(price), purchased_at
FROM purchases
WHERE character_name = "わんこ"
GROUP BY purchased_at
;

-- WHEREに条件を付け足してcategoryが食費であるデータを、purchased_atとcharacter_nameでグループ化

SELECT SUM(price), purchased_at, character_name
FROM purchases
WHERE category ="食費"
GROUP BY purchased_at, character_name
;
