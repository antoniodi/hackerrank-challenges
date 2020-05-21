package challenges

class EasyChallenge {

}

object EasyChallenge {

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
