//繰り返し構文とscanner
//Main.java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("何人分の情報を入力しますか：");
    int n = scanner.nextInt();  //scannerで整数で帰ってきてほしいので、nextIntとする
    for (int i = 0; i < n; i++){      //繰り返し構文
      System.out.print(i + 1 + "人目");  //iの初期値が0のため1を加えて出力
      System.out.print("名前：");
      String firstName = scanner.next();
      System.out.print("名字：");
      String lastName = scanner.next();
      System.out.print("年齢：");
      int age = scanner.nextInt();
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
      Person.printData(firstName, lastName, age, height, weight);
    }
  }
}

//Person.java
class Person{
  public static void printData(String firstName, String lastName, int age, double height, double weight){
    System.out.println("名前は" + fullName(firstName, lastName) + "です");
    System.out.println("年齢は" + age + "歳です");
    if (age >= 20){
      System.out.println("成年者です");
    }else{
      System.out.println("未成年者です");
    }
    System.out.println ("身長は" + height + "mです");
    System.out.println ("体重は" + weight + "kgです");
    double bmi = bmi(height, weight);
    System.out.println ("BMIは" + Math.round(bmi)+ "です");
    if (isHealthy(bmi)){
      System.out.println("健康です");
    }else{
      System.out.println("健康ではありません");
    }
  }

  public static String fullName(String firstName, String lastName){
    return firstName + " " + lastName;
  }
  
  public static double bmi(double height, double weight){
    return weight / height / height;
  }
  
  public static boolean isHealthy(double bmi){
    return bmi >= 18.5 && bmi < 25.0;
  }
}
------------------------------------------------------------------------------------------------------------------------------
//最高年齢の出力を追加
//Main.java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("何人分の情報を入力しますか：");
    int n = scanner.nextInt();
    int maxAge = 0;
    for (int i = 0; i < n; i++){
      System.out.print(i + 1 + "人目");
      System.out.print("名前：");
      String firstName = scanner.next();
      System.out.print("名字：");
      String lastName = scanner.next();
      System.out.print("年齢：");
      int age = scanner.nextInt();
      if (age > maxAge){
        maxAge = age;  //ageがmaxAgeより大きいときはageをmaxAgeに代入
      }
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
      Person.printData(firstName, lastName, age, height, weight);
    }
  System.out.println("最高年齢は" + maxAge + "歳です");
  }
}

//Person.java
同上
---------------------------------------------------------------------------------------------------------------------------------
//最高年齢の出力を追加
//Main.java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("何人分の情報を入力しますか：");
    int n = scanner.nextInt();
    int maxAge = 0;
    int sumAge = 0;
    for (int i = 0; i < n; i++){
      System.out.print(i + 1 + "人目");
      System.out.print("名前：");
      String firstName = scanner.next();
      System.out.print("名字：");
      String lastName = scanner.next();
      System.out.print("年齢：");
      int age = scanner.nextInt();
      if (age > maxAge){
        maxAge = age;
      }
      sumAge += age;
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
      Person.printData(firstName, lastName, age, height, weight);
    }
  System.out.println("最高年齢は" + maxAge + "歳です");
  System.out.println("平均年齢は" + sumAge / n + "歳です");
  
