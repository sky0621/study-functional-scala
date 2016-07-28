package chap02.orien

/**
  * Created by SS on 2016/07/29.
  */
object Fibo {

  // [0] 0
  // [1] 1
  // [2] 1
  // [3] 2
  // [4] 3
  // [5] 5
  // [6] 8
  // [7] 13
  // [8] 21
  // [9] 34
  // [10] 55
  // [11] 89
  def fib(n: Int): Int = {
    @annotation.tailrec
    def culc(beforeVal: Int, nowVal: Int, nowIndex: Int, byIndex: Int): Int = {
      if(nowIndex > byIndex) 0
      else if(nowIndex == byIndex) nowVal
      else culc(nowVal, beforeVal + nowVal, nowIndex + 1, byIndex)
    }

    culc(0, 1, 1, n)
  }

  def main(args: Array[String]): Unit = {
    println("[0]<0>: " + fib(0))
    println("[1]<1>: " + fib(1))
    println("[2]<1>: " + fib(2))
    println("[3]<2>: " + fib(3))
    println("[4]<3>: " + fib(4))
    println("[5]<5>: " + fib(5))
    println("[6]<8>: " + fib(6))
    println("[7]<13>: " + fib(7))
    println("[8]<21>: " + fib(8))
    println("[9]<34>: " + fib(9))
    println("[10]<55>: " + fib(10))
  }

}
