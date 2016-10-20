package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
  if (c > r || c < 0) 0
  else if (r == 0) 1
  else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def accum(opened: Int, closed: Int, chars: List[Char]): Boolean = (opened, closed, chars) match {
      case (opened, closed, ')' :: xs) => if (closed + 1 > opened) false else accum(opened, closed + 1, xs)
      case (opened, closed, '(' :: xs) => accum(opened + 1, closed, xs)
      case (opened, closed, _ :: xs) => accum(opened, closed, xs)
      case (opened, closed, Nil) => opened == closed
    }

    accum(0, 0, chars)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = (money, coins) match {
    case (0, _) => 1
    case (m, _) if m < 0 => 0
    case (_, cs) if cs.isEmpty => 0
    case (m, cs) => countChange(m - cs.head, cs) + countChange(m, cs.tail)
  }
}
