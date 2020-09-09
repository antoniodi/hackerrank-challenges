package challenges.daysOfCode

object Day7Arrays {

  def main(args: Array[String]): Unit = {
    val list = List( 1,2,3,4,5)
    list.reverse.mkString( " ")
    printReverseList( list )

  }

  def printReverseList( list: List[Int] ): Unit = {
    list.lastOption.fold(){ last =>
      print( s"$last " )
      printReverseList( list.dropRight(1))
    }
  }
}
