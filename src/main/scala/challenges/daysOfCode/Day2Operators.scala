package challenges.daysOfCode

object Day2Operators {

  def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {

    print((meal_cost + meal_cost*(tip_percent.toDouble/100) + meal_cost*(tax_percent.toDouble/100) ).round)
  }
}
