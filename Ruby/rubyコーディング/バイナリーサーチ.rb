以下の配列に任意の値が存在するかどうか、そして何番目に存在するのか、検索するコードを作成する。

array=[1,3,5,6,9,10,13,20,26,31]
任意の値が配列内に存在しない場合は、「値は配列内に存在しません」と表示し、
存在する場合は、配列の何番目にあるかを表示する。
※本ドリルでは、配列の上限である32以上の値による検索は想定しないものとする。

検索はバイナリーサーチ（2分割検索）を使用して行う。
--------------------------------------------------------------------------------------------
def binary_search(array, right, target)
  left = 0
  while left <= right　#lengthで判断
    center = (left + right) / 2　#2分割して考える（配列番号真ん中を取得）
    if array[center] == target
      return center　# targetと一致（探し出せた）のでcenterを呼び出し元へ。
    elsif array[center] < target　#targetが右側にあるか
      left = center + 1　# 左端の位置をcenterの１つ右へ。
    else　#targetが左側にある
      right = center - 1　# 左端の位置をcenterの１つ左へ。
    end
  end
  return -1 # targetと一致するものがなかった（探し出せなかった）ので―1を呼び出し元へ
end

array=[1,3,5,6,9,10,13,20,26,31]

puts "検索したい数字を入力してください"
target = gets.to_i
number_of_elements = array.length

result = binary_search(array, number_of_elements, target)

if result == -1
  puts "#{target}は配列内に存在しません"
else
  puts "#{target}は配列の#{result}番目に存在します "
end

※出力例
検索したい数字を入力してください
6
6は配列の3番目に存在します 
