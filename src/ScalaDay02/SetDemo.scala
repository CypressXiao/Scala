package ScalaDay02

import scala.collection.mutable

object SetDemo {
  def main(args:Array[String]):Unit = {
    val set = Set[String]("java", "java", "hive", "spark", "flink")
    for (elem <- set) {
      println(elem)
    }

    val set1 = new mutable.HashSet[Int]()
    set1.add(1)
    set1.add(1)
    set1.add(2)
    set1.add(3)
    println(set1.size)
    println(set1.remove(4))
    println(set1)
  }

}
