package challenges.daysOfCode

object Day9Recursion {

  def main(args: Array[String]): Unit = {
    println( factorial(4) )
  }

  def factorial(n: Int): Int = {
    if( n > 1 ) n * factorial( n - 1 ) else 1
  }

}
