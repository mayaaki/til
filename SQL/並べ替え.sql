-- priceカラムを基準に降順に並び替えたデータを取得
SELECT *
FROM purchases
ORDER BY price DESC;

-- 、priceカラムを基準に昇順に並び替えたデータを取得(WHEREとORDER　BYの併用)
SELECT *
FROM purchases
WHERE character_name = "わんこ"
ORDER BY price ASC;
