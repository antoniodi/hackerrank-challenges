val meal_cost = 12.00
val tip_percent = 20
val tax_percent = 8

val a = 1.45.round

val total = (meal_cost + meal_cost*(tip_percent.toDouble/100) + meal_cost*(tax_percent.toDouble/100) ).toInt

val li = List( 1, 2, 3 ).zipWithIndex
li( 0)