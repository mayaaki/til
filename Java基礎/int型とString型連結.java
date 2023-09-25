//int とstringの組み合わせであれば、数値がstringと変わる
//doubleとintの組み合わせであれば自動的にdoubleで出力される
class Main {
  public static void main(String[] args) {
    int month = 12;
    int date = 31;
    
    // 「12月31日」となるように変数と文字列を連結して出力してください
    System.out.println(month + "月" + date + "日");
    
    // 7を2で割った値を出力してください
    System.out.println(7 / 2);
    
    // 7.0を2.0で割った値を出力してください
    System.out.println(7.0 / 2.0);
    
    // 7を2.0で割った値を出力してください
    System.out.println(7 / 2.0);
    
  }
}

//強制的に型変換を行う(キャスト)場合、どちらか一方の前に（double）と入れると、片方がdouble型になり、出力も自動変換で、doubleとなる
class Main {
  public static void main(String[] args) {
    int number1 = 7;
    int number2 = 2;
    System.out.println(number1 / number2);
    
    // number1をdouble型にキャストし、number2で割った値を出力してください
    System.out.println((double)number1 / number2);
    
  }
}
