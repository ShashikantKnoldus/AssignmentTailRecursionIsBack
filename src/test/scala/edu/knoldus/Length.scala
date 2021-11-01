package edu.knoldus

class Length {
  def LengthOfList(n: List[Int], accum: Int = 0): Int = {
    if (n == Nil) accum
    else {
      LengthOfList(n.tail, accum = accum + 1)
    }
  }
}
