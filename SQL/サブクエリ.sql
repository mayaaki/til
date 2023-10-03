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
