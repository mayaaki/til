//コンストラクタ
//インスタンスフィールドへのセットを楽にする
//newを使ってインスタンス生成後に自動で呼び出される
//①コンストラクタ名はクラス名と同じにする、②戻り値を書いてはいけない（voidも書かない）という2つの決まりがある

//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate Jones"); //インスタンス生成時点で呼び出されるのがコンストラクタ
    Person person2 = new Person("John Christopher Smith"); //同上
  }
}

//Person.java
class Person {
  public String name;

  // コンストラクタを定義
  Person(String name){ 　　　　　　　　　　　　　　　　　　//Main.javaのnameの引数を受け取る
    System.out.println("インスタンスが生成されました");
    // インスタンスフィールドnameに値をセット
    this.name = name;
  }

  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}
---------------------------------------------------------------------
//Main.java
  class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    
    System.out.println(person1.firstName);
    System.out.println(person1.lastName);
    System.out.println(person1.age);
    System.out.println(person1.height);
    System.out.println(person1.weight);
  }
}

