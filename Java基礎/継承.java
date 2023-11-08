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
class Bicycle extends Vehicle {
  // コードをVehicleクラスに移動
}
