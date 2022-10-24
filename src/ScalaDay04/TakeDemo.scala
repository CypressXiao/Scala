package ScalaDay04

object TakeDemo {
  def main(args:Array[String]):Unit = {
   val arr:Array[Int] =Array[Int](1,1,2,3,4,5,6,22,33)
    println(arr.take(3).mkString(","))
    println(arr.takeRight(3).mkString(","))

    println(arr.takeWhile(_ == 1).mkString(","))
  }
}
