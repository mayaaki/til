//条件分岐
money = 100
apple_price = 200

if money >= apple_price:
    print('りんごを買うことができます')
# if 文の条件に当てはまらない場合に「 お金が足りません 」と出力
else:
    print('お金が足りません')

//elifを使った条件分岐
//elifはいくらでも使える。
money = 100
apple_price = 100

if money > apple_price:
    print('りんごを買うことができます')
# 変数の値が等しい場合に「 りんごを買うことができますが所持金が0になります 」と出力してください
elif money == apple_price:
    print('りんごを買うことができますが所持金が0になります')

else:
    print('お金が足りません')
