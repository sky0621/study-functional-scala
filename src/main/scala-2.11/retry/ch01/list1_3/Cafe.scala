package retry.ch01.list1_3

/**
  * Created by SS on 2017/09/16.
  */
class Cafe {
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()

    // 副作用を起こしうるものを返り値にする
    (cup, Charge(cc, cup.price))
  }

  def buyCoffees(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
    val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(cc))
    val (coffees, charges) = purchases.unzip
    (coffees, charges.reduce((c1, c2) => c1.combine(c2)))
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
  def combine(other: Charge): Charge =
    if (cc == other.cc)
      Charge(cc, amount + other.amount)
    else
      throw new Exception("Can't combine")
}
