-- purchased_atごとのお金を使った数を取得

SELECT COUNT(price),  purchased_at
FROM purchases
GROUP BY purchased_at
;
