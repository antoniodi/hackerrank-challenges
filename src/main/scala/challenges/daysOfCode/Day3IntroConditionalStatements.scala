package challenges.daysOfCode

object Day3IntroConditionalStatements {

  def main(args: Array[String]): Unit = {
    10 match {
      case odd if odd % 2 != 0 => print("Weird")
      case even if even % 2 == 0 => even match {
        case even if even >= 2 && even <= 5 => print("Not Weird")
        case even if even >= 6 && even <= 20 => print("Weird")
        case _ => print("Not Weird")
      }
    }
  }

}
