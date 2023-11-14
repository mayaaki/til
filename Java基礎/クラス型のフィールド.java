//Person型のownerというインスタンスフィールドを持つように定義

//Vehicle.java
abstract class Vehicle {
  private String name;
  private String color;
  protected int distance = 0;
  // インスタンスフィールドownerを定義
  private Person owner;

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
  
  // ownerフィールドのゲッターを定義
  public Person getOwner(){
    return this.owner;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  
  // ownerフィールドのセッターを定義
  public void setOwner(Person person){
    this.owner = person;
  }

  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }

  public abstract void run(int distance);
}

//Car.java
class Car extends Vehicle {
  private int fuel = 50;

  Car(String name, String color) {
    super(name, color);
  }

  public int getFuel() {
    return this.fuel;
  }

  public void printData() {
    super.printData();
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  public void run(int distance) {
    System.out.println(distance + "km走ります");
    if (distance <= this.fuel) {
      this.distance += distance;
      this.fuel -= distance;
    } else {
      System.out.println("ガソリンが足りません");
    }
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

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
