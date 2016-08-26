package chap03.basic.list0301

// シールドトレイト・・・同一ファイル内でのみ実装可
sealed trait List[+A]

case object Nil extends List[Nothing]

// 基本コンストラクタの引数にvalを追加
// 上記のフィールドを使用して equals、hashCode、toString メソッドを実装
// インスタンスの型が一致する場合は true を返す canEqual メソッドを実装
// フィールドをコピーして新規インスタンスを生成する copy メソッドを実装。変更したいフィールドのみ指定する。
// コンパニオンオブジェクトを生成し、apply メソッド、unapply メソッドを実装
case class Cons[+A]() extends List[A]

/**
  * Created by SS on 2016/08/27.
  */
object List {

}
