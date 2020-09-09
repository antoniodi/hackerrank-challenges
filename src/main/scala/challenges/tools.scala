package challenges

object tools {

  def howToReadFromLine(): String = {
    val stdin = scala.io.StdIn

    val meal_cost = stdin.readLine.trim.toDouble

    val tip_percent = stdin.readLine.trim.toInt

    val tax_percent = stdin.readLine.trim.toInt

    ""
  }

  def otherWayToReadFromCommandLine(): String = {

    val stdin = scala.io.StdIn

    val printWriter = new java.io.PrintWriter( sys.env("OUTPUT_PATH") )

    val nk = stdin.readLine.split(" ")

    val n = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val s = stdin.readLine

    //val result = highestValuePalindrome(s, n, k)

    //printWriter.println(result)

    printWriter.close()

    ""
  }

  def otherWayToReadFromCommandLine1(): List[List[(Int, Int)]] = {

    val stdin = scala.io.StdIn

    val numbersOfFunctions = stdin.readLine.toInt

    val functions = ( 1 to numbersOfFunctions ).map( _ => {
      val coordinates = stdin.readLine.toInt
      ( 1 to coordinates ).map( _ => {
        val nk = stdin.readLine.split(" ")
        ( nk(0).trim.toInt, nk(1).trim.toInt )
      }).toList
    }).toList

    functions
  }

  def read() = {
    val stdin = scala.io.StdIn
    Iterator.continually( stdin.readLine ).takeWhile( _ != null )
  }
}
