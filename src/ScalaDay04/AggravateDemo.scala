package ScalaDay04

import scala.collection.parallel.mutable.ParArray

object AggravateDemo {
  def main(args:Array[String]):Unit = {
    val ls:Array[Int] = Array[Int](1,2,3,4,5,6)

    val arr:ParArray[Int] = ls.par

    //函数1:map逻辑,函数2:reduce逻辑
    println(arr.aggregate(10)(_ + _, _ + _))
  }

}
