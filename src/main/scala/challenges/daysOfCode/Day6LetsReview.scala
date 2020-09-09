package challenges.daysOfCode

object Day6LetsReview {

  def main(args: Array[String]): Unit = {

    val string = "Hola"


    val stdin = scala.io.StdIn

    val words = stdin.readLine.trim.toInt

    (1 to words).foreach( _ => {
      val word = stdin.readLine.trim
      evenAndOddWord( word )
    })
  }

  private def evenAndOddWord(word: String) = {
    val newWord = word.zipWithIndex.foldLeft(("", ""))((resultado, caracterYIndice) => {
      if (caracterYIndice._2 % 2 == 0) resultado.copy(_1 = s"${resultado._1}${caracterYIndice._1}")
      else resultado.copy(_2 = s"${resultado._2}${caracterYIndice._1}")
    })
    println(s"${newWord._1} ${newWord._2}")
  }
}
