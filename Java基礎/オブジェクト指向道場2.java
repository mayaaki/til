//Carクラスの生成

//Main.java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int bicycleDistance = scanner.nextInt();
    bicycle.run(bicycleDistance);
    System.out.println("=================");
    
    //Carクラスのインスタンスの生成と引き渡し
    Car car = new Car("フェラーリ", "赤");
    System.out.println("【車の情報】");
    //Carクラスの情報（printDataメソッド）を呼び出し
    car.printData();
  }
}
