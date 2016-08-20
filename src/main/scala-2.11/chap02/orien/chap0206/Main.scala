package chap02.orien.chap0206

/**
  * Created by SS on 2016/08/11.
  */
object Main extends App {

  // 部分適用
  // 【引数】A型の変数と f 関数
  // 【戻り値】関数（B型変数を受け取って、C型変数を返す）

  // ※ f 関数は、A型の変数とB型の変数を引数として受け取る
  // ※戻り値の関数は、B型変数を引数として受け取って、C型変数を返す

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = {
    b => f(a, b)
  }

}
