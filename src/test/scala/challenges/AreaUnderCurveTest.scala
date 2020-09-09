package challenges

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class AreaUnderCurveTest extends AnyWordSpec with Matchers {

  "Calling AreaUnderCurve" should {
    "return the value of area" in {


      def cycle(start: Double, end: Double, volume: Double = 0): Double = {
        if (start <= end)
          cycle(start + 0.001, end, volume + TestData.areaUnderCurve.f(List(1, 2, 3, 4, 5), List(6, 7, 8, 9, 10), start) * 0.001)
        else volume
      }
      cycle(1, 4)
//        value += TestData.areaUnderCurve.f(List(1, 2, 3, 4, 5), List(6, 7, 8, 9, 10), 3.toDouble)
      value shouldEqual 2423600.1887
    }
  }

}
