package retry.ch01.list1_1

/**
  * Created by SS on 2017/08/25.
  */
class Cafe {
  def buyCoffee(cc: CreditCard): Coffee = {
    val cup = new Coffee()

    // 副作用（外部との通信を伴う）
    // ・クレジットカード会社に問い合わせてチャージする
    // ・チャージ記録を保持する
    cc.Charge(cup.price)

    cup
  }
}

class CreditCard {
  def Charge(p: Double): Unit = {
    println(p)
  }
}

class Coffee {
  val price = 0
}