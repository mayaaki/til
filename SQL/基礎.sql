//SQLを用いて、 purchasesテーブルから、priceカラムのデータを取得

SELECT price
FROM purchases;
-----------------------------------------------------------------

//purchasesテーブルから、全てのカラムのデータを取得

SELECT *
From purchases;
--------------------------------------------------------------------
//purchasesテーブルから、「nameカラム」と「priceカラム」のデータを取得

SELECT name, price
FROM purchases;
-------------------------------------------------------------------
//「FROM purchases」のあとにコードを追加し、categoryカラムが「食費」であるデータを取得
SELECT *
FROM purchases
WHERE category = "食費";
