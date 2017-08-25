package retry.ch01.list1_2

/**
  * Created by SS on 2017/08/25.
  */
class Cafe {
  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {
    val cup = new Coffee()

    // 副作用（外部との通信を伴う）
    p.Charge(cc, cup.price)

    cup
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