package chap01.cafe.phase04

import chap01.cafe.phase01.{Coffee, CreditCard}
import chap01.cafe.phase03.Charge

/**
  * Created by SS on 2016/07/16.
  */
class Cafe {

  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()
    (cup, Charge(cc, cup.price))
  }

  def buyCoffees(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
    // buyCoffee の結果のコピーを n 個含んだ List を生成
    val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(cc))
//    val (coffees, charge) = purchases.unzip(coffees, charge.reduce())
//    (coffees, charge)
    Nil
  }

}
