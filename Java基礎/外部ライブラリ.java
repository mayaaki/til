//外部ライブラリを導入
//Mathは数学的メソッドを持つライブラリ
// java.lang.Mathを読み込み

//Main.java
class Main {
  public static void main(String[] args) {
    Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
  }
}

//Person.java
import java.lang.Math;
class Person {
  public static void printData(String name, int age, double height, double weight) {
      System.out.println("私の名前は" + name + "です");
      System.out.println("年齢は" + age + "歳です");
      System.out.println("身長は" + height + "mです");
      System.out.println("体重は" + weight + "kgです");
      double bmi = bmi(height, weight);
      // Mathクラスのroundメソッドを用いて、BMIを四捨五入して出力
      System.out.println("BMIは" + Math.round(bmi) + "です");
   }
  public static double bmi(double height, double weight) {
      return weight / height / height;
  }
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
}
