package ScalaDay05

abstract class AbstractDemo(id:Int, name:String) {
  val a:Int
  var b:String

  def add(num1:Int, num2:Int):Int

  def multi(n1:Double, n2:Double):Double = {
    n1 * n2
  }

}
