package challenges.easy

object fibonacci {

  def main(args: Array[String]): Unit = {
    val number = fibonacciNumber( 4 )
    println(number)
  }

  def fibonacciNumber( number: Int ): Int = {
    if ( number < 1 ) 0
    else {
      (1 to (number + 1)).foldLeft[List[Int]](List()) { ( fibonacciSeries, _ ) =>
        fibonacciSeries match {
          case Nil => List(1)
          case fibonacciNumbers => fibonacciNumbers :+ fibonacciNumbers.takeRight(2).sum
        }
      }.lastOption.getOrElse(1)
    }
  }
}
