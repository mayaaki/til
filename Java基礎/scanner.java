//文字を入力させて出力

// java.util.Scannerを読み込み
import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    //scannerを初期化
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("名前： ");
    
    // 変数nameを定義し、コンソールから文字列を受け取って代入
    String name = scanner.next();
    
    // 「こんにちは◯◯さん」と出力
    System.out.println("こんにちは" + name + "さん");
  }
}

//整数や少数を入力してもらう場合
    System.out.print("名前：");
    // 文字列の入力を受け取る
    String name = scanner.next();
    
    System.out.print("年齢：");
    // 整数の入力を受け取る
    int age = scanner.nextInt();
    
    System.out.print("身長(m)：");
    // 小数の入力を受け取る
    double height = scanner.nextDouble();

//まとめ
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前：");
    String firstName = scanner.next();
    System.out.print("名字：");
    String lastName = scanner.next();
    System.out.print("年齢：");
    int age = scanner.nextInt();
    System.out.print("身長(m)：");
    double height = scanner.nextDouble();
    System.out.print("体重(kg)：");
    double weight = scanner.nextDouble();
    printData(firstName, lastName, age, height, weight);
  }


  public static void printData(String firstName, String lastName, int age, double height, double weight){
    System.out.println("名前は" + fullName(firstName, lastName) + "です");
    System.out.println("年齢は" + age + "歳です");
    if (age >= 20){
      System.out.println("成年者です");
    }else{
      System.out.println("未成年者です");
    }
    System.out.println ("身長は" + height + "mです");
    System.out.println ("体重は" + weight + "kgです");
  }

  public static String fullName(String firstName, String lastName){
    return firstName + " " + lastName;
  }
}
