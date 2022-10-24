package ScalaDay01

object FunctionDemo1 {
  val sum: (Int, Int, Int) => Int = (x: Int, y: Int, z: Int) => {
    x + y + z
  }

  val concat: (String, String) => Unit = (str1: String, str2: String) => {
    println(s"$str1-$str2")
  }

  val max: (Double, Double) => Double = (a: Double, b: Double) => {
    if (a > b) a else b
  }

  val show: () => Unit = () => {
    println("Hello!")
  }

  val get: () => String = () => {
    "Hello!"
  }

  val show1: AnyVal => AnyVal = (a: AnyVal) => {
    a
  }

  def main(args: Array[String]): Unit = {
    println(sum(1, 2, 3))
    concat("Jordan", "James")
    println(max(23.1, 21.3))
    show()
    println(get())
    println(show1(66))
  }
}
