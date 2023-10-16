//Main.java
//クラスは実体を持たない設計図、インスタンスは実体を持ち、1つのクラスからいくつも生成可能。
//インスタンスは情報＝インスタンスフィールド（名前・年齢）や、振る舞い＝インスタンスメソッド（歩く・走る・挨拶）などを持つ
//インスタンスメソッドは、クラスに定義しても、実際は各インスタンスに属するため、インスタンスメソッドはインスタンス（を代入した変数）に対して呼び出す
//インスタンスフィールドは、情報を格納しておく変数にすぎないため、その変数はクラスの一番上に定義する
//インスタンスフィールドも各インスタンスに属し、インスタンスを生成するときに、各インスタンスにフィールドがコピーされるというイメージ
class Main {
  public static void main(String[] args) {
    
    // Personクラスのインスタンスを生成し、変数person1に代入
    Person person1 = new Person();
    // person1に対して、helloメソッドを呼び出す
    person1.hello();
    // person1のインスタンスフィールドnameに「Kate Jones」をセット
    person1.name = "Kate Jones";
    // person1のインスタンスフィールドnameの値を出力
    System.out.println(person1.name);
    
    // Personクラスのインスタンスを生成し、変数person2に代入
    Person person2 = new Person();
    // person2に対して、helloメソッドを呼び出す
    person2.hello();
    // person2のインスタンスフィールドnameに「John Christopher Smith」をセット
    person2.name = "John Christopher Smith";
    // person2のインスタンスフィールドnameの値を出力
    System.out.println(person2.name);
  }
}

//Person.java
// Personクラスを定義
class Person{
  // インスタンスフィールドnameを定義
  public String name;
   // インスタンスメソッドhelloを定義
  public void hello(){
    System.out.println("こんにちは");
  }
}
---------------------------------------------------------------------
//thisを使用
//クラス内のメソッド定義のなかで使える。
//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Kate Jones";
    person1.hello();

    Person person2 = new Person();
    person2.name = "John Christopher Smith";
    person2.hello();
  }
}

//Person.java
class Person {
  public String name;

  public void hello() {
    // thisを用いて、「こんにちは、私は◯◯です」で出力するように以下を書き換えてください
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}
-------------------------------------------------------------------------
