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
//Bicycle.javaとほとんど同じ
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

//Bicycle.java
class Bicycle {
  private String name;
  private String color;
  private int distance = 0;
  
  Bicycle(String name, String color) {
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
--------------------------------------------------------------------------
//ガソリン量の追加
//ガソリン量1Lで1km走ると想定した場合

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
    Car car = new Car("フェラーリ", "赤");
    System.out.println("【車の情報】");
    car.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");

    //車の走行距離の入力を求める
    int carDistance = scanner.nextInt();
    //入力された走行距離をrunメソッドに引き渡す
    car.run(carDistance);
  }
}

//Car.java
//残ガソリン量に応じて条件分岐を行う（runメソッド）

class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  
  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }
  
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
  public void run(int runDistance) {
    System.out.println(runDistance + "km走ります");

    //走行距離が残ガソリン量以下の場合は走行距離とガソリン量の更新
    //上記でなければ更新せずに「ガソリン量が足りません」と表示
    if(runDistance <= this.fuel) {
    this.distance += runDistance;
      
    //走行距離が1kmの場合1Lの消費と想定するため下記式が成り立つ
    this.fuel -= runDistance;
    }else{
      System.out.println("ガソリンが足りません");
    }
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");  
  }
}

--------------------------------------------------------------------------
//給油メソッドの追加

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
    Car car = new Car("フェラーリ", "赤");
    System.out.println("【車の情報】");
    car.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int carDistance = scanner.nextInt();
    car.run(carDistance);
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int charge = scanner.nextInt();
    car.charge(charge);
  }
}

//Car.java
class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  
  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }
  
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
  public void run(int runDistance) {
    System.out.println(runDistance + "km走ります");
    if(runDistance <= this.fuel) {
    this.distance += runDistance;
    this.fuel -= runDistance;
    }else{
      System.out.println("ガソリンが足りません");
    }
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  //chargeメソッド
  //入力された給油量が0以下のとき、給油できません。ガソリン量＋給油量の合計が100以上のときガソリン量に100を代入し、更新。それ以外の場合はガソリン量＋給油量の合計をガソリン量に代入、更新。
  public void charge(int charge) {
    System.out.println(charge + "L給油します");
    if(charge <= 0) {
      System.out.println("給油できません");
    }else if(charge + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    }else{
      this.fuel += charge;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
}
 
