package chap02.orien

/**
  * Created by SS on 2016/08/04.
  */
object MyModule3 {

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

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))
  }

}
