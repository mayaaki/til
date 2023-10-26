//カプセル化
//privateを使ってクラス外からのアクセスはできないようにする

//記述方法
class Person {
  private String firstName;
  private String middleName;
  private String lastName;
}
//上記は別クラス（例えばMainクラス）からは呼び出せない

