package retry.ch01.list1_2b

/**
  * Created by SS on 2017/08/25.
  */
class Cafe {
  def buyCoffee(cc: CreditCard, p: Payments): (Coffee, Charge) = {
    val cup = new Coffee()

    // 副作用を起こしうるものを返り値にする
    (cup, Charge(cc, cup.price))
  }
}

class CreditCard {

}

class Coffee {
  val price = 0
}

class Payments {
  def Charge(cc: CreditCard, p: Double): Unit = {
    println(p)
  }
}

case class Charge(cc: CreditCard, amount: Double) {
}
