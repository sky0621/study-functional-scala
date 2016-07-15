package chap01.cafe.phase03

import chap01.cafe.phase01.{Coffee, CreditCard}

/**
  * Created by SS on 2016/07/16.
  */
class Cafe {
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()
    (cup, Charge(cc, cup.price))
  }
}
