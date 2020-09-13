package challenges.daysOfCode

object Day10BinaryNumbers {

  def main(args: Array[String]): Unit = {
    val binaryNumber = toBinaryNumber( 439 )
    println( binaryNumber.takeWhile( _ == '1').length )
  }

  def toBinaryNumber( decimalNumber: Int ): String = if( decimalNumber <=2 ) s"${decimalNumber  % 2 }" else s"${toBinaryNumber( decimalNumber / 2)}${decimalNumber % 2}"
}
