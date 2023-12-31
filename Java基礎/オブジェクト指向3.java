//クラスフィールドの設定
//インスタンスフィールドとは違い、クラスフィールドはクラスに属する
//クラスフィールドの定義は、staticを用いる

//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    
    Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
    person2.printData();
    
    // 「合計◯◯人です」と出力 クラス名.クラスフィールド名で出力
    System.out.println("合計" + Person.count + "人です");    
  }
}


//Person.java
class Person {
  // int型のクラスフィールドcountを定義し、0を代入
  public static int count = 0;
  
  public String firstName;
  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    // 変数countに1を足す
    Person.count ++ ;
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }
  
  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }
}
----------------------------------------------------------------------------------------------
//クラスメソッド
//countして呼び出し

//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    
    Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
    person2.printData();
    
    // printCountメソッドを呼び出し
    Person.printCount();
    
  }
}

//person.java
class Person {
  public static int count = 0;
  public String firstName, lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  // クラスメソッドprintCount()を定義
  public static void printCount(){
    System.out.println("合計" + Person.count + "人です");
  }
}
----------------------------------------------------------------------------
//コンストラクタのオーバーロード
  
//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    
    // middleNameとして「Christopher」を渡してください
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person2.printData();
    
    Person.printCount();
  }
}

//Person.java
class Person {
  public static int count = 0;
  public String firstName;
  // インスタンスフィールドmiddleNameを定義
  public String middleName;
  
  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }
  
  // middleNameを受け取るコンストラクタを定義
  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }
------------------------------------------------------------------------------------------------------
//上記重複部分をthisを用いてコンストラクタを呼び出す
//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person2.printData();
    Person.printCount();
  }
}

//Person.java
class Person {
  public static int count = 0;
  public String firstName;
  public String middleName;
  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    // this()を用いて、コンストラクタを呼び出す
    this(firstName, lastName, age, height, weight);
    
    this.middleName = middleName;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }
  ---------------------------------------------------------------------------------------------------
  //middleNameの条件分岐

  //Main.java
  //下記以外は上記から変更なし
  public String fullName() {
    // 以下を、middleNameがない場合とある場合で条件分岐
    if (middleName == null){
      return this.firstName + " " + this.lastName;
    }else{
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }
  
  
