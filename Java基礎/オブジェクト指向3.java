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
