//Main.java
//クラスは実体を持たない設計図、インスタンスは実体を持ち、1つのクラスからいくつも生成可能。
//インスタンスは情報＝インスタンスフィールド（名前・年齢）や、振る舞い＝インスタンスメソッド（歩く・走る・挨拶）などを持つ
//インスタンスメソッドは、クラスに定義しても、実際は各インスタンスに属するため、インスタンスメソッドはインスタンス（を代入した変数）に対して呼び出す
class Main {
  public static void main(String[] args) {
    // Personクラスのインスタンスを生成し、変数person1に代入
    Person person1 = new Person();
    // person1に対して、helloメソッドを呼び出す
    person1.hello();
    
    // Personクラスのインスタンスを生成し、変数person2に代入
    Person person2 = new Person();
    // person2に対して、helloメソッドを呼び出す
    person2.hello();
  }
}

//Person.java
// Personクラスを定義
class Person{
   // インスタンスメソッドhelloを定義
  public void hello(){
    System.out.println("こんにちは");
  }
}
---------------------------------------------------------------------
  
