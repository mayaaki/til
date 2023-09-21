以下の要件を満たすend_otherメソッドを実装する

メソッドの引数に、任意の2つの文字列を指定。
引数に指定された2つの文字列のうち、どちらかがもう一方の文字列の末尾にある場合は、Trueを出力する
上記を満たせていない場合は、Falseを出力する
入力された文字が大文字でも小文字でも、同一の文字として処理を行う
---------------------------------------------------------------------------
# slice・・・・
array = "Hiabc"
#配列番号（インデックス番号）の-3から-1の範囲の文字列を切り取る
array.slice(-3..-1)
#=> abc

#　downcaseメソッド　#大文字を小文字にする
name = "Hiabc"
name.downcase
=> "hiabc"

---------------------------------------------------------------------------
def end_other(a, b)
  a_down = a.downcase
  b_down = b.downcase
  a_len = a_down.length
  b_len = b_down.length
  if b_down.slice(-(a_len)..- 1) == a_down || a_down.slice(-(b_len)..- 1) == b_down
    puts "True"
  else
    puts "False"
  end
end

end_other('Hiabc', 'abc') 
