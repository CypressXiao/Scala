package ScalaDay05

object SupremeFuncDemo {
  def main(args:Array[String]):Unit = {
    println(calculate(10, 1.2, operator))
    println(operator1("hello")("world"))
  }

  def operator(x:Int, y:Double):Double = {
    x * y
  }

  def calculate(a:Int, b:Double, f:(Int, Double) => Double):Double = {
    f(a, b)
  }

  def operator1(str1:String):String => String ={
    val f:String => String = (str2:String) => str1 + str2
    f
  }


}
