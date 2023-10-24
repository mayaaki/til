//if,elsifの条件分岐が多く複雑な場合、switch文で書き換えると良い
//caseのでれにも一致しなかった場合、defaultのブロックが実行される
//break命令は現在のブロックから脱出する命令（これがないと次のcaseブロックも実行される）

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Progate</title>
  <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>

  <?php

    // 変数$numを定義
    $num = 12;
  
    // 変数$remainderを定義し、変数$numを3で割った時の余りを代入
    $remainder = $num % 3;
 
    // switch文
    switch ($remainder) {
      case 0:
        echo '大吉です。';
        break;
      case 1:
        echo '中吉です。';
        break;
      case 2:
        echo '小吉です。';
        break;
      default:
        echo '凶です。';
        break;
    }
  ?>
</body>
