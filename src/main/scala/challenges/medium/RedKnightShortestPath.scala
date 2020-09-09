package challenges.medium

object RedKnightShortestPath {

  def printShortestPath(n: Int, i_start: Int, j_start: Int, i_end: Int, j_end: Int) {
    if( isGoalReach( i_start, j_start, i_end, j_end ) ) {
      val ( minMoves, moves ) = moveToGoal( ( i_start, j_start ), ( i_end, j_end ) )
      println( minMoves )
      println( moves )
    } else {
      println("Impossible")
    }
  }

  def moveToGoal( knight: ( Int, Int ), goal: ( Int, Int ), movesCount: Int = 0, moves: String = "" ): (Int, String ) = {
    knight match {
      case ( goal._1, goal._2 ) => ( movesCount, moves.trim )
      case ( goal._1, knightJ ) =>
        val nextMove = if ( knightJ > goal._2 ) "L" else "R"
        moveToGoal( move( nextMove, knight ), goal, movesCount + 1, s"$moves $nextMove" )
      case ( knightI, knightJ ) if knightI > goal._1 && knightJ >= goal._2 =>
        moveToGoal( move( "UL", knight ), goal, movesCount + 1, s"$moves UL" )
      case ( knightI, knightJ ) if knightI > goal._1 && knightJ < goal._2 =>
        moveToGoal( move( "UR", knight ), goal, movesCount + 1, s"$moves UR" )
      case ( knightI, knightJ ) if knightI < goal._1 && knightJ <= goal._2 =>
        moveToGoal( move( "LR", knight ), goal, movesCount + 1, s"$moves LR" )
      case _ =>
        moveToGoal( move( "LL", knight ), goal, movesCount + 1, s"$moves LL" )
    }
  }

  def isGoalReach( i_start: Int, j_start: Int, i_end: Int, j_end: Int ): Boolean = {
    //Math.abs( j_start - j_end ) % 2 * 2 != Math.abs( i_start - j_start ) % 4

    if ( ( j_start == j_end ) && ( ( Math.abs( i_start - i_end ) % 4 ) == 0 ) ) true
    else ( Math.abs( i_start - i_end - 2 ) % 4 ) == 0
  }

  def move( movimiento: String, knight: ( Int, Int ) ): ( Int, Int ) = {
    movimiento match {
      case "UL" =>  knight.copy( _1 = knight._1 - 2, _2 = knight._2 - 1 )
      case "UR" =>  knight.copy( _1 = knight._1 - 2, _2 = knight._2 + 1 )
      case "R"  =>  knight.copy( _2 = knight._2 + 2 )
      case "LR" =>  knight.copy( _1 = knight._1 + 2, _2 = knight._2 + 1 )
      case "LL" =>  knight.copy( _1 = knight._1 + 2, _2 = knight._2 - 1 )
      case "L"  =>  knight.copy( _2 = knight._2 - 2 )
    }
  }

//  def isGoalReach( n: Int, XStart: Int, YStart: Int, XEnd: Int, YEnd: Int ): Boolean = {
//    val boardSize = n - 1
//
//    if ( ( XStart > 0 ) && ( YStart > 0 ) && ( XEnd > 0 ) && ( YEnd > 0 ) ) {
//      if ( ( boardSize >= XStart ) && ( boardSize >= YStart ) && ( boardSize >= XEnd ) && ( boardSize >= YEnd ) ) {
//        if ( ( XStart == XEnd ) && ( Math.abs( YStart - YEnd ) == 0 ) ) true
//        else ( Math.abs( YStart - YEnd - 2 ) % 4 ) == 0
//      } else false
//    } else false
//  }

}
