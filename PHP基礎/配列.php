//配列
//インデックス番号が0～順に割り振られる

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Progate</title>
  <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>

  <?php

    // この下に配列を作ってください
    $colors = array('赤', '青', '黄');
    echo $colors[0];
    $colors[] = '白';
    echo $colors[3];
  ?>

</body>
</html>
-----------------------------------------------------------------------------------------
//連想配列
//index.php
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Progate</title>
  <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>

  <?php

    // 下記が配列
    $scores = array('数学' => 70, '英語' => 90, '国語' => 80);
    $scores['国語'] += 5;
    echo $scores['国語'];
    
  ?>

</body>
</html>
