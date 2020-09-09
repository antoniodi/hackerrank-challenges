package challenges.easy

object FunctionsOrNot {

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val numbersOfFunctions = stdin.readLine.toInt

    ( 1 to numbersOfFunctions ).map( _ => {
      val coordinates = stdin.readLine.toInt
      val functions = ( 1 to coordinates ).map( _ => {
          stdin.readLine.split(" ")(0).toInt
        })
      if( functions.distinct.size == functions.size ) println( "YES" ) else println( "NO" )
    })

  }
}
