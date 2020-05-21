package challenges

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class EasyChallengeTest  extends AnyWordSpec with Matchers {

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
