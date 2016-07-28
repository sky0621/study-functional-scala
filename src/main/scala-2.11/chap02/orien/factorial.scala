package chap02.orien

/**
  * Created by SS on 2016/07/29.
  */
object factorial {

  def factor(n: Int): Int = {

    // now : 今の値
    // total : 合算値（※基準値含む）
    @annotation.tailrec
    def nxn(now: Int, total: Int): Int = {
      if(now < 1) total
      else nxn(now - 1, now * total)
    }

    nxn(n, 1)
  }

  def main(args: Array[String]): Unit = {
    println(factor(7))
  }

}
