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
---------------------------------------------------------------------
//purchased_atカラムが「2017-07-01」のデータを取得
SELECT *
FROM purchases
WHERE purchased_at = "2017-07-01";
--------------------------------------------------------------------
//purchased_atカラムが「2017-08-01以前」のデータを取得
SELECT *
FROM purchases
WHERE purchased_at <= "2017-08-01";
--------------------------------------------------------------------
//、nameカラムが「プリン」を含むデータを取得
SELECT *
FROM purchases
WHERE name LIKE "%プリン%";
