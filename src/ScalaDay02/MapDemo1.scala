package ScalaDay02

import scala.collection.mutable

object MapDemo1 {
  def main(args:Array[String]):Unit = {
   /*val map = Map[String, Int]("hgy" -> 43, "reba" -> 34, "fengjie" -> 47)
     val m1 = map.map(e => e)
    println(m1)
    println("==============================================")
    map.foreach(e=>print(e+"\t"))*/
    val map1 = Map[String,Int](("Jordan",47),("Kobe",42),("James",37))
    println(map1)

    val mmp = mutable.Map[String, Int]("hgy" -> 43, "reba" -> 34, "fengjie" -> 47)
    mmp.put("hgy",31)
    println(mmp)

    mmp.remove("hgy")
    println(mmp)

    println("=======================================")
    val keys = map1.keys
    for (elem <- keys) {
      println(elem)
      val v = map1.getOrElse(elem,-1)
      println(v)
    }

    println("=======================================")
    val iterator = map1.toIterator
    while(iterator.hasNext){
      println(iterator.next())
    }

    println("=======================================")
    map1.map(e=>println(e))

    println("=======================================")
    map1.foreach(println)

    println("=======================================")
    for (elem <- map1) {
      println(elem._1)
      println(elem._2)
    }
  }
}
