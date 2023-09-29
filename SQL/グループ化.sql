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
