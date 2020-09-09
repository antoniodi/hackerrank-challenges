package patterns.adhoc

class AdHoc {

}

object TypeClass {

  trait Adder[A] {
    def add(x: A, y: A): A
  }

  object Adder {
    def apply[A: Adder]: Adder[A] = implicitly
  }

  implicit object IntAdder extends Adder[Int] {
    override def add(x: Int, y: Int)= x + y
  }

  implicit object StringAdder extends Adder[String] {
    override def add(x: String, y: String)= x + y
  }

  def combine[A: Adder](x: A, y: A): A =
    Adder[A].add(x, y)

  def main(args: Array[String]): Unit = {
    combine(1, 2)
    combine("abc", "xyz")
  }

}

object Test {

  def main(args: Array[String]): Unit = {
    println( TypeClass.combine(1, 2) )
    println( TypeClass.combine("Hola", "2") )

  }
}