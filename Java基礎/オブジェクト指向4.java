//カプセル化
//privateを使ってクラス外からのアクセスはできないようにする

//記述方法
class Person {
  private String firstName;
  private String middleName;
  private String lastName;
}
//上記は別クラス（例えばMainクラス）からは呼び出せない

--------------------------------------------------------------------------------------------
//フィールドをprivateにしたうえで、クラス外から安全にフィールの値を取得するゲッターを使用
//ゲッターは、「getフィールド名」のように命名するのが一般的です

//Main.java
  class Main {
    public static void main(String[] args) {
      Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    }
  }
 // person2に対して、getMiddleNameメソッドを呼び出し、「person2のミドルネームは◯◯です」と出力
    System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");


//Person.java
  class Person {
  private String middleName;
    // middleNameフィールドのゲッターを定義
    public String getMiddleName(){
      return this.middleName;
    }
  }
