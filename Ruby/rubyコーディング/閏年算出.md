# 閏年算出
①その西暦が4で割り切れたら閏年である
②ただし、例外として100で割り切れる西暦の場合は閏年ではない
③ただし、その例外として400で割り切れる場合は閏年である


def get_days(year, month)
  month_days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
  if month == 2　# 2月に絞る
    if year % 4 == 0　# 年が4で割り切れること
      if year % 100 == 0 && year % 400 != 0　# 年が100で割り切れてかつ、400では割り切れないこと
        days = 28
      else
        days = 29
      end
    else
      days = 28
    end
  else
    days = month_days[month - 1] # 配列の順番に合わせるため―1をする
  end

  return days　# 呼びだし元へ
end

puts "年を入力してください："
year = gets.to_i
puts "月を入力してください："
month = gets.to_i

days = get_days(year, month)
puts "#{year}年#{month}月は#{days}日間あります"
