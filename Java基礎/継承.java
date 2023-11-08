//継承
//スーパークラスとサブクラス
//新たにスーパークラスを作って継承する

//Main.java
class Main {
  public static void main(String[] args) {
    Car car = new Car();
    Bicycle bicycle = new Bicycle();
  }
}

//Vehicle.java
class Vehicle{
  private String name;
  private String color;
  private int distance = 0;

  public String getName() {
    return this.name;
  }
  public String getColor() {
    return this.color;
  }
  public int getDistance() {
    return this.distance;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }
}

//Bicycle.java
class Bicycle extends Vehicle {
  // コードをVehicleクラスに移動
}

//Car.java
class Car extends Vehicle {
  // コードをVehicleクラスに移動
}
---------------------------------------------------------------
//Carクラス（サブクラス）はVehicleクラス（スーパークラス）のフィールドとメソッドを引き継いでいる
//よって、Carクラス自体にはまだ何も定義されていないが、Carクラスのインスタンスに対して、Vehicleクラスのインスタンスメソッドを呼び出すことが可能

//Main.java
class Main {
  public static void main(String[] args) {
    Car car = new Car();
    // setNameメソッドを用いて、carの名前を「フェラーリ」に
    car.setName("フェラーリ");
    
    // setColorメソッドを用いて、carの色を「赤」に
    car.setColor("赤");
    
    Bicycle bicycle = new Bicycle();
    // setNameメソッドを用いて、bicycleの名前を「ビアンキ」に
    bicycle.setName("ビアンキ");
    
    // setColorメソッドを用いて、bicycleの色を「緑」に
    bicycle.setColor("緑");
    
    System.out.println("【車の情報】");
    car.printData();

    System.out.println("=================");
    System.out.println("【自転車の情報】");
    bicycle.printData();
  }
}

//Car.java
class Car extends Vehicle {
}

//bicycle.java
class Bicycle extends Vehicle {
}
  
//Vehicle.java
class Vehicle {
  private String name;
  private String color;
  private int distance = 0;

  public String getName() {
    return this.name;
  }
  public String getColor() {
    return this.color;
  }
  public int getDistance() {
    return this.distance;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }
}

//呼び出したメソッドが、サブクラスに定義されていればサブクラスから、定義されていなければスーパークラスから呼び出される
//Main.java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car();
    car.setName("フェラーリ");
    car.setColor("赤");
    Bicycle bicycle = new Bicycle();
    bicycle.setName("ビアンキ");
    bicycle.setColor("緑");

    System.out.println("【車の情報】");
    car.printData();
    // getFuelメソッドを用いて「ガソリン量：◯◯L」と出力
    System.out.println("ガソリン量：" + car.getFuel() + "L");
    
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int litre = scanner.nextInt();
    // chargeメソッドを呼び出して、引数にlitreを渡してください
    car.charge(litre);

    System.out.println("=================");
    System.out.println("【自転車の情報】");
    bicycle.printData();
  }
}

//Car.java
class Car extends Vehicle {
  // インスタンスフィールドfuelを定義
  private int fuel = 50;
  
  // fuelフィールドのゲッターを定義
  public int getFuel(){
    return this.fuel;
  }
  
  // インスタンスメソッドchargeを定義
  public void charge(int litre) {
    System.out.println(litre + "L給油します");
    if (litre <= 0) {
      System.out.println("給油できません");
    } else if (litre + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else {
      this.fuel += litre;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
}

  
