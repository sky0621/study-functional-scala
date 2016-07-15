package chap01.cafe.phase01

/**
  * Created by SS on 2016/07/16.
  */
class Cafe {
  def buyCoffee(cc: CreditCard): Coffee = {
    val cup = new Coffee()
    cc.charge(cup.price)
    cup
  }
}
