package challenges.daysOfCode

object Day8DictionariesAndMaps {

//  3
//  sam 99912222
//  tom 11122222
//  harry 12299933
//  sam
//  edward
//  harry
//  Sample Output
//
//  sam=99912222
//  Not found
//    harry=12299933

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val names = stdin.readLine.toInt

    val dictionary = ( 1 to names ).map( _ => {
      val dictionary = stdin.readLine.split(" ")
      dictionary( 0 ) -> dictionary( 1 )
    }).toMap

    Iterator.continually( stdin.readLine ).takeWhile( _ != null ).foreach { name =>
      println( dictionary.get( name ).fold( "Not found" ){ value =>s"${name}=$value" } )
    }

  }

}
