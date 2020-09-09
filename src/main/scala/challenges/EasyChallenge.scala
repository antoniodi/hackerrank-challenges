package challenges

class EasyChallenge {

}

object EasyChallenge {

  def perimeterOfPolygon(): Int = {

    val numberOfPoints = io.StdIn.readInt()
    val listOfPoints = (1 to numberOfPoints).map{ _ =>
      val line = io.StdIn.readLine().split(" ")
      (line.head.toInt, line.last.toInt)
    }

//    def calculateArea(listOfPoints: List[(Int, Int)]): Int = {
//      (listOfPoints.head, listOfPoints.last) match {
//        case ((x1, y1), (x2, y2)) => if (x1 == x2) =>
//      }
//    }
    ???
  }

//  def calculateArea(listOfPoints: List[(Int, Int)]): Int = {
//    val points = listOfPoints :+ listOfPoints.take(1)
//    points.reduceByKey()
//    points.fold(0)((initPoint, nextPoint) => 1).sum
//    {
//      case (initPoint, nextPoint) => initPoint + nextPoint
//    }

//    (firstTwoPoints.head, firstTwoPoints.lastOption) match {
//      case ((x1, y1), Some((x2, y2))) if x1 == x2 => Math.abs(y1 - y2)
//      case ((x1, y1), Some((x2, y2))) if y1 == y2 => Math.abs(x1 - x2)
//      case ((x1, y1), None) =>
//    }
//  }

  def seriesExpansion(n: Int, x: Double): String = {
    def factorial(n: Double): Double = if (n > 1) n * factorial(n - 1) else 1
    f"${(1 until 10).map(value => Math.pow(x, value)/factorial(value)).sum + 1}%.04f"
  }

  def getAbsoluteValues(arr:List[Int]):List[Int] = {
    arr.map(Math.abs)
  }

  def countElements(arr: List[Int]):Int = arr.headOption match {
      case Some(_) => 1 + countElements(arr.drop(1))
      case None    => 0
    }

}
