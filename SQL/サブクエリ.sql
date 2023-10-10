-- サブクエリを使ってgoalsカラムの値がウィルの得点より高いレコードを取得
SELECT name
FROM players
WHERE goals > (
  -- ウィルの得点数を取得するクエリ
  SELECT goals
  FROM players
  WHERE name = "ウィル"
)
;

-- サブクエリを使ってgoalsの値の平均よりも大きい値のレコードを取得
SELECT name,goals
FROM players
WHERE goals > (
  SELECT AVG(goals)
  FROM players
)
;

--ASを使って、取得したカラム名を"身長180cm以上の選手"とする
SELECT name AS "身長180cm以上の選手"
FROM players
WHERE height >= 180
;

--ASを使って、取得したカラム名を"チームの合計得点"とする
SELECT SUM(goals) AS "チームの合計得点"
FROM players
;

--日本よりランクが上位である国のデータを取得する
SELECT *
FROM countries
WHERE rank < (
  SELECT rank
  FROM countries
  WHERE name = "日本"
)
;
