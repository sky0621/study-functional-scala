package chap02.orien

/**
  * Created by SS on 2016/07/29.
  */
object MyModule2 {

  def abs(n: Int): Int = {
    if(n < 0)  -n
    else n
  }

  private def formatAbs(n: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(n, abs(n))
  }

  def main(args: Array[String]): Unit = println(formatAbs(-1))

}
