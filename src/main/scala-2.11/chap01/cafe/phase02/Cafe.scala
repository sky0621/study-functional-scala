package chap01.cafe.phase02

import chap01.cafe.phase01.{Coffee, CreditCard}

/**
  * Created by SS on 2016/07/16.
  */
class Cafe {
  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {
    val cup = new Coffee()
    p.charge(cc, cup.price)
    cup
  }
}
