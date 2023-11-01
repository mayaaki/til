//インスタンスフィールド
//インスタンスを生成
//コンストラクタでインスタンス生成時に実行

//Main.java
class Main {
  public static void main(String[] args) {
    //インスタンス生成
    Bicycle bicycle = new Bicycle("ビアンキ");
    
    System.out.println("【自転車の情報】");
    
    //ゲッターを使って、プライベート変数を取得
    System.out.println("名前：" + bicycle.getName());
  }
}

//Bicycle.java
class Bicycle {
   //プライベートなインスタンスフィールドを設定
   private String name;            
               
   // インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意            
   Bicycle(String name) {            
     this.name = name;            
   }            
               
   // Mainクラスからnameフィールドの値を取得するためにゲッターを定義            
   public String getName() {            
     return this.name;            
   }            
 }
------------------------------------------------------------------------------------------
//上記をprintDataメソッドでまとめ、Main.javaからBicycle.javaへ移す
//printDaraメソッドでまとめて移行したことで、ゲッターで取得の必要がなくなるので消す

//Main.java
class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    System.out.println("【自転車の情報】");

    //上記のBicycle bicycleにおけるprintDataの呼び出し
    bicycle.printData();
  }
}

//Bicycle.java
class Bicycle {
  private String name;
  private String color;
  
  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
  }
  
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
  }
}
--------------------------------------------------------------------------------------
//走行距離を追加する（初期値は0km）
