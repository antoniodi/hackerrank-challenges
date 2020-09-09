package challenges.easy

object ComputePerimeterOfPolygon {

  def main(args: Array[String]): Unit = {

    val coordinates = List( ( 0, 0 ),
                            ( 0, 1 ),
                            ( 1, 1 ),
                            ( 1, 0 ) )

    val perimeter = perimeterOfPolygon( coordinates ++ coordinates.headOption )

    //( coordinates ++ coordinates.headOption ).foldLeft(0,0 ){  }

    println(f"$perimeter%.1f")
  }

  def perimeterOfPolygon( points: List[(Int, Int)], perimeter: Double = 0 ): Double = {
    points match {
      case (x1, y1 ) +: ( x2, y2 ) +: _ => perimeterOfPolygon( points.drop(1), perimeter + distanceBetweenTwoPoints( (x1, y1), (x2, y2) ) )
      case _ => perimeter
    }
  }

  def distanceBetweenTwoPoints( pointA: (Int, Int), pointB: (Int, Int)): Double = {
    Math.sqrt( Math.pow( pointB._1 - pointA._1, 2 ) + Math.pow( pointB._2 - pointA._2, 2 ) )
  }

  def calculatePerimeter( points: List[(Int, Int)], perimeter: Double = 0 ): Double = {
    points match {
      case (x1, y1) +: (x2, y2) +: _ => calculatePerimeter(points.drop(1), perimeter + distanceIntoTwoPoints(x1, y1, x2, y2))
      case _ => perimeter
    }
  }

    def distanceIntoTwoPoints(x1: Int, y1: Int, x2: Int, y2: Int): Double = {

      Math.sqrt( Math.pow( x2 - x1, 2 ) + Math.pow( y2 - y1, 2 )  )
    }

  def otherway() = {
    def distance(p1:(Int,Int),p2:(Int,Int)): Double =
      math.sqrt(math.pow(p1._1-p2._1,2)+math.pow(p1._2-p2._2,2))

    val lines=io.Source.stdin.getLines()

    val nPoints= lines.next.toInt
    val points = lines.take(nPoints).toList map (s => s.split(" ")) map {case Array(e1,e2) => (e1.toInt,e2.toInt)}

    val polygLine = points :+ points.head
    //polygLine.sliding()

    val perimeter= (polygLine.tail.foldLeft((0.0,polygLine.head)){case (acc,p)=> (acc._1+distance(acc._2,p),p)})._1


    println(perimeter)
  }

}
