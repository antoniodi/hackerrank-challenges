package challenges.daysOfCode

object Day6LetsReview {

  def main(args: Array[String]): Unit = {

    val string = "Hola"
    val palabra = string.zipWithIndex.foldLeft( ("", "" ) )( ( resultado, caracterYIndice ) => {
      if( caracterYIndice._2 % 2 == 0 ) resultado.copy( _1 = s"${resultado._1}${caracterYIndice._1}" )
      else resultado.copy( _2 = s"${resultado._2}${caracterYIndice._1}" )
    } )
    println( s"${palabra._1} ${palabra._2}")
  }
}
