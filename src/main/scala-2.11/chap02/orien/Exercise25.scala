package chap02.orien

/**
  * Created by SS on 2016/08/21.
  */
object Exercise25 extends App {

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }
}
