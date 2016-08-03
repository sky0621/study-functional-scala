package chap02.orien

/**
  * Created by SS on 2016/08/04.
  */
object MyModule4 {

  def abs(n: Int): Int = {
    if(n < 0)  -n
    else n
  }

  def factorial(n: Int): Int = {
    // now : 今の値
    // total : 合算値（※基準値含む）
    @annotation.tailrec
    def nxn(now: Int, total: Int): Int = {
      if(now < 1) total
      else nxn(now - 1, now * total)
    }
    nxn(n, 1)
  }

  private def formatResult(name: String, x: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name, x, f(x))
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("absolute value", -42, abs))
    println(formatResult("factorial", 7, factorial))
  }

}
