package challenges

class EasyChallenge {

}

object EasyChallenge {

  def countElements(arr: List[Int]):Int = arr.headOption match {
      case Some(_) => 1 + countElements(arr.drop(1))
      case None    => 0
    }

}
