--複数テーブルを繋げ外部キーを使用してグループ化・合計得点を取得する
SELECT SUM(goals), country_id
FROM players
GROUP BY country_id
;
