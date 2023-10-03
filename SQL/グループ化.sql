--SQLのグループ化の順番
--1.検索(WHERE)
--2.グループ化(GROUP BY)
--3.関数(COUNT,SUM,AVG,MAX,MIN)
--4.HAVING--GROUP BYによってグループ化されたものを検索対象とする



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

-- 日付ごとの合計金額のうち、2000円を超えるデータのみを取得

SELECT SUM(price), purchased_at
FROM purchases
GROUP BY purchased_at
HAVING SUM(price) > 2000
;

-- 日付とキャラクターごとの合計金額のうち、3000円を超えるデータのみを取得

SELECT SUM(price), purchased_at, character_name
FROM purchases
GROUP BY purchased_at, character_name
HAVING SUM(price) > 3000
;

-- categoryでグループ化し、各カテゴリーごとにpriceカラムの合計とcategoryカラムのデータを取得

SELECT SUM(price), category
FROM purchases
GROUP BY category
;

-- キャラクターごとにグループ化し、priceカラムの合計と、character_nameを取得
-- ただし、WHEREでcategoryが「雑費」であるレコードから集計

SELECT SUM(price), character_name
FROM purchases
WHERE category = "雑費"
GROUP BY character_name
;


