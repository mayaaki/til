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
