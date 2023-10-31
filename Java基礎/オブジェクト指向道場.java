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
