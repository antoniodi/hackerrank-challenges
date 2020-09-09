package challenges.easy

object FunnyString {

  def main(args: Array[String]): Unit = {
    val word = "acxz"
    val wordBytes = getAdjacentSum( word )

    val reverseWordBytes = getAdjacentSum( word.reverse )

    //if( wordBytes == reverseWordBytes ) "Funny" else "Not Funny"
    getAdjacentSum2( "acxz", 4)
  }

  def getAdjacentSum( word: String ): List[Int] = {
    word.drop( 1 ).foldLeft[( List[Int], Option[Char])]( ( List(), word.headOption ) ){ ( bytesAndFirstLetter, nextLetter) =>
      bytesAndFirstLetter._2 match {
        case Some( letter ) => ( bytesAndFirstLetter._1 :+ Math.abs( letter.toByte - nextLetter.toByte ), Some( nextLetter ) )
        case _ => ( bytesAndFirstLetter._1, Some( nextLetter ) )
      }
    }._1
  }

  def getAdjacentSum2(word: String, length: Int, i: Int = 0 ): String = {
    if ( i < length - 1 ) {
      if ( Math.abs( word( i ).toByte - word( i + 1 ).toByte ) != Math.abs( word( length - i - 2 ).toByte - word( length - i - 1 ).toByte ) ) {
        "Not Funny"
      } else getAdjacentSum2( word, length, i + 1 )
    } else "Funny"

  }

}
