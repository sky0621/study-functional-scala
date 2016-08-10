package chap02.orien.chap0205

/**
  * Created by SS on 2016/08/11.
  */
object List25kai extends App {

  // 無名関数を渡す
  // 糖衣構文（シュガーシンタックス）
  val res = findFirst2(Array("A","B","O","AB"), (s: String) => s == "B")
  println(res)

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
