package chap02.orien.chap0205

/**
  * Created by SS on 2016/08/11.
  */
object List25 {

  def main(args: Array[String]): Unit = {

    val ary: Array[String] = Array("Apple", "Orange", "Banana", "Peach", "Grape")
    println(findFirst(ary, "Peach"))
    println(findFirst(ary, "Mango"))

    val ary2: Array[String] = new Array[String](5)
    ary2(0) = "Scala"
    ary2(1) = "Java"
    ary2(2) = "Ruby"
    ary2(3) = "Go"
    ary2(4) = "PHP"
    println(findFirst(ary2, "Java"))

  }

  // 配列内で String を検索する単相関数
  def findFirst(ss: Array[String], key: String): Int = {

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

}
