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
