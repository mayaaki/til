//抽象メソッドと抽象クラス
//abstractを使用して定義
//抽象メソッドを１つでも用いるクラスは抽象クラスとなりクラス名にabstractをつける必要がある
//サブクラスには必ず抽象メソッドの中の処理の記述が必要。なければエラーとなる

//Vehicle.java
// Vehicleクラスを抽象クラスに変更
abstract class Vehicle {
  private String name;
  private String color;
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
    System.out.println("走行距離：" + this.distance + "km");
  }
  
  // 抽象メソッドrunを定義
  public abstract void run(int distance);
  
}
