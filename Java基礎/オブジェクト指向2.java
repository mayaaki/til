//コンストラクタ
//インスタンスフィールドへのセットを楽にする
//newを使ってインスタンス生成後に自動で呼び出される
//①コンストラクタ名はクラス名と同じにする、②戻り値を書いてはいけない（voidも書かない）という2つの決まりがある

//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person(); //インスタンス生成時点で呼び出されるのがコンストラクタ
    Person person2 = new Person(); //同上
  }
}

//Person.java
class Person {
  public String name;

  // コンストラクタを定義
  Person(){
    System.out.println("インスタンスが生成されました");
  }

  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}
