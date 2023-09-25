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

//総復習
class Main {
  public static void main(String[] args) {
    // 変数nameに、好きな名前を代入してください
    String name = "まや";
    
    // 変数ageに、好きな年齢を代入してください
    int age = 26;
    
    // 変数heightに、好きな身長を代入してください（例: 1.2）
    double height = 156.7;
    
    // 変数weightに、好きな体重を代入してください（例: 20.0）
    double weight = 47.0;
    
    // 変数bmiに、BMIを計算して代入してください
    double bmi = weight / height / height;
    
    // 名前、年齢、身長、体重、BMIに関する情報を出力してください
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");
  }
}

