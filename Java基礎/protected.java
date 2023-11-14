//protectedであれば、サブクラスからスーパークラスでの定義した変数を使用可能

//Main.java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car("フェラーリ", "赤");
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");

    System.out.println("【車の情報】");
    car.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int carDistance = scanner.nextInt();
    // runメソッドを呼び出して、引数にcarDistanceを渡す
    car.run(carDistance);
    
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int litre = scanner.nextInt();
    car.charge(litre);
    
    System.out.println("=================");
    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int bicycleDistance = scanner.nextInt();
    // runメソッドを呼び出して、引数にbicycleDistanceを渡しす
    bicycle.run(bicycleDistance);
  }

//Vehicle.java
class Vehicle {
  private String name;
  private String color;
  // protectedを用いる
  protected int distance = 0;

  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

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
    System.out.println("走行距離：" + this.distance + "(km)");
  }
}

//Bicycle.java
//Car.javaは省略
class Bicycle extends Vehicle {
  Bicycle(String name, String color) {
    super(name, color);
  }

  public void run(int distance) {
    System.out.println(distance + "km走ります");
    this.distance += distance;
    System.out.println("走行距離：" + this.distance + "km");
  }
}

