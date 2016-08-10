package chap02.orien.chap0205

/**
  * Created by SS on 2016/08/11.
  */
object List26 extends App {

  val ary2: Array[String] = new Array[String](5)
  ary2(0) = "Scala"
  ary2(1) = "Java"
  ary2(2) = "Ruby"
  ary2(3) = "Go"
  ary2(4) = "PHP"
  println(findFirst(ary2, "Java"))

  def matchi(s: String): Boolean = {
    if (s == "PHP") true
    else false
  }

  println(findFirst2(ary2, matchi))

  // 配列内で A を検索する総称関数
  def findFirst[A](ss: Array[A], key: A): Int = {

    // 配列中から指定Indexの要素をチェック、指定の要素とマッチすればそのIndexを、マッチしなければ -1 をリターン
    // 末尾再帰（コールスタックフレーム消費を防ぐ）
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)
    }

    loop(0)
  }

  // 配列内で A を検索する総称関数
  def findFirst2[A](ss: Array[A], f: A => Boolean): Int = {

    // 配列中から指定Indexの要素をチェック、指定の要素とマッチすればそのIndexを、マッチしなければ -1 をリターン
    // 末尾再帰（コールスタックフレーム消費を防ぐ）
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (f(ss(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

}
