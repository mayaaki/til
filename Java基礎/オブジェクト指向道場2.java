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

//Car.java
class Car {
  private String name;
  private String color;
  private int distance = 0;
  
  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }
  
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }
  
  public void run(int runDistance) {
    System.out.println(runDistance + "km走ります");
    this.distance += runDistance;
    System.out.println("走行距離：" + this.distance + "km");
  }
}
