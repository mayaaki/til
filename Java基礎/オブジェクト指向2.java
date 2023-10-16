//コンストラクタ
//インスタンスフィールドへのセットを楽にする
//newを使ってインスタンス生成後に自動で呼び出される
//①コンストラクタ名はクラス名と同じにする、②戻り値を書いてはいけない（voidも書かない）という2つの決まりがある

//Main.java
class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();
  }
}
