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
