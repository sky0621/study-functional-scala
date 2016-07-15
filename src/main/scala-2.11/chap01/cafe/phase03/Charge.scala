package chap01.cafe.phase03

import chap01.cafe.phase01.CreditCard

/**
  * Created by SS on 2016/07/16.
  */
case class Charge(cc: CreditCard, amount: Double) {

  def combine()(other: Charge): Charge = {
    if(cc == other.cc) {
      Charge(cc, amount + other.amount)
    } else {
      throw new Exception("Can't combine charges to different cards")
    }
  }

}
