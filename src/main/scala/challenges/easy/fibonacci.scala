package challenges.easy

object fibonacci {

  def main(args: Array[String]): Unit = {
    val number = fibonacciNumber( 4 )
    val a = fibonacciNumber2( 2 )
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

  def fibonacciNumber2( number: Int ): Int = {
    List.fill(number - 1)(0).foldLeft((0,1))( (a,b) => (a._2,a._1+a._2))._1
  }
}
