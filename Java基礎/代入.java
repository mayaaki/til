//省略して代入

class Main {
  public static void main(String[] args) {
    int number = 8;
    
    // 変数numberに7をかけて、変数numberを上書き
    number *= 7;
    
    // 変数numberを出力
    System.out.println(number);
    
    // 変数numberの値に1を足して、変数numberを上書き
    number ++;
    
    // 変数numberを出力
    System.out.println(number);
    
  }
}

//変数利用

class Main {
  public static void main(String[] args) {
    int length = 6;
    int height = 8;
    
    // 変数rectangleAreaに、四角形の面積を代入してください
    int rectangleArea = length * height;
    
    // 変数rectangleAreaを出力してください
    System.out.println(rectangleArea);
    
    // 変数triangleAreaに、三角形の面積を代入してください
    int triangleArea = length * height / 2;
    
    // 変数triangleAreaを出力してください
    System.out.println(triangleArea);
    
  }
}

//小数点型（double）

class Main {
  public static void main(String[] args) {
    // double型の変数number1を定義し、8.5を代入してください。
    double number1 = 8.5;
    
    // double型の変数number2を定義し、3.4を代入してください。
    double number2 = 3.4;
    
    // number1にnumber2を足した値を出力してください
    System.out.println(number1 + number2);
    
    // number1からnumber2を引いた値を出力してください
    System.out.println(number1 - number2);
    
  }
}
