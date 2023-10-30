//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0, "医者");
    person1.printData();
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
    person2.printData();
    System.out.println("----------------------");
    // person1の仕事を「獣医」に変更
    person1.setJob("獣医");
    
    // 「person1の仕事を◯◯に変更しました」と出力
    System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
    
    person1.printData();
  }
}

//Person.java
class Person {
  private static int count = 0;
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;
  // インスタンスフィールド「job」を追加
  private String job;
  
  // コンストラクタの書き換え
  Person(String firstName, String lastName, int age, double height, double weight, String job) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.job = job;
  }
  
  // コンストラクタの書き換え
  Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
    this(firstName, lastName, age, height, weight, job);
    this.middleName = middleName;
  }

  public String getMiddleName() {
    return this.middleName;
  }
  
  // jobのゲッターを定義
  public String getJob(){
    return this.job;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  
  // jobのセッターを定義
  public void setJob(String job){
    this.job = job;
  }
  

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
    // 「仕事は◯◯です」と出力してください
    System.out.println("仕事は" + this.job + "です");
    
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}
