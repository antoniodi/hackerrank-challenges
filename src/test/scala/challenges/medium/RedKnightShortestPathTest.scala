package challenges.medium

import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RedKnightShortestPathTest extends AnyWordSpec with Matchers {

  "Calling isGoalReach" when {

    "is reach" should {
      "indicate if is not reach" in {

        val result = RedKnightShortestPath.isGoalReach( 5, 1, 0, 5 )

        result mustBe false
      }
    }

    "is reach" should {
      "indicate if is reach" in {

        val result = RedKnightShortestPath.isGoalReach( 0, 3, 4, 3 )

        result mustBe true
      }
    }

    "moveToGoal 0" should {
      "indicate if is reach" in {

        val result = RedKnightShortestPath.moveToGoal( ( 6, 6 ), ( 0, 1 ) )

        result mustBe (4, "UL UL UL L")
      }
    }

    "moveToGoal 1" should {
      "indicate if is reach" in {

        val result = RedKnightShortestPath.moveToGoal( ( 0, 3 ), ( 4, 3 ) )

        result mustBe (2, "LR LL")
      }
    }

    "moveToGoal test case 3" should {
      "indicate if is reach" in {

        val result = RedKnightShortestPath.moveToGoal( ( 4, 1 ), ( 0, 3 ) )

        result mustBe (2, "UR UR")
      }
    }

    "moveToGoal test case 5" should {
      "indicate if is reach" in {

        val result = RedKnightShortestPath.moveToGoal( ( 9, 9 ), ( 5, 3 ) )

        result mustBe (4, "UL UL L L")
      }
    }

    "moveToGoal test case 9" should {
      "indicate if is reach" in {

        val result = RedKnightShortestPath.moveToGoal( ( 2, 24 ), ( 92, 45 ) )

        result mustBe (45, "LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LR LL LL LL LL LL LL LL LL LL LL LL LL")
      }
    }
  }
}
