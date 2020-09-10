package challenges.easy

object AlternatingCharacters {

  def main(args: Array[String]): Unit = {
    val word = alternatingCharacters( "BBBBB" )
    word
  }

  def alternatingCharacters(s: String): Int = {
    s.foldLeft(( 0, "") )( ( alter, nextLetter ) => {
      val nextString = nextLetter.toString
      if( alter._2 == nextString ) (alter._1 + 1, nextString ) else ( alter._1, nextString )
    })._1

  }
}
