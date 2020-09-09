package challenges

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class EasyChallengeTest  extends AnyWordSpec with Matchers {

  "Calling calculate area" should {
    "return the sum of area" in {
//      EasyChallenge.calculateArea(List((0, 0), List(0, 1), List(1, 1), List(1, 0))) shouldEqual "4"
    }
  }

  "Calling series expansion" should {
    "return the series expansion" in {
      EasyChallenge.seriesExpansion(10, 20.0000) shouldEqual "2423600.1887"
      EasyChallenge.seriesExpansion(10, 5.0000) shouldEqual "143.6895"
      EasyChallenge.seriesExpansion(10, 0.5000) shouldEqual "1.6487"
      EasyChallenge.seriesExpansion(10, -0.5000) shouldEqual "0.6065"
    }
  }

  "Calling getAbsoluteValues" should {
    "return the absolute values number list" in {
      EasyChallenge.getAbsoluteValues(List(1, -2, -3)) shouldEqual List(1, 2, 3)
      EasyChallenge.getAbsoluteValues(List(2 ,-4 ,3 ,-1 ,23 ,-4 ,-54)) shouldEqual List(2 ,4 ,3 ,1 ,23 ,4 ,54)
    }
  }

  "Calling countElements" should {
    "return the correct number of elements" in {
      EasyChallenge.countElements(List(1, 2, 3)) shouldEqual 3
    }
  }

//  "stations" should {
//    "be initialized correctly" in {
//      planner.stations shouldEqual Set(munich, nuremberg, frankfurt, cologne, essen)
//    }
//  }
//
//  "Calling trainsAt" should {
//    "return the correct trains" in {
//      planner.trainsAt(munich) shouldEqual Set(ice724, ice726)
//      planner.trainsAt(cologne) shouldEqual Set(ice724)
//    }
//  }
//
//  "Calling stopsAt" should {
//    "return the correct stops" in {
//      planner.stopsAt(munich) shouldEqual Set(ice724MunichTime -> ice724, ice726MunichTime -> ice726)
//    }
//  }
//
//  "Calling isShortTrip" should {
//    "return false for more than one station in between" in {
//      planner.isShortTrip(munich, cologne) shouldBe false
//      planner.isShortTrip(munich, essen) shouldBe false
//    }
//    "return true for zero or one stations in between" in {
//      planner.isShortTrip(munich, nuremberg) shouldBe true
//      planner.isShortTrip(munich, frankfurt) shouldBe true
//      planner.isShortTrip(nuremberg, frankfurt) shouldBe true
//      planner.isShortTrip(nuremberg, essen) shouldBe true
//    }
//  }

}
