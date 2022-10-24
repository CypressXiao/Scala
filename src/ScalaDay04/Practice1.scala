package ScalaDay04

import scala.collection.{immutable, mutable}
import scala.collection.mutable.ListBuffer
import scala.io.{BufferedSource, Source}

object Practice1 {
  //求各个省份的平均气温
  /*def main(args:Array[String]):Unit = {
    val d1:Array[(String, Double)] = Array(("beijing", 28.1), ("shanghai", 28.7), ("guangzhou", 32.0), ("shenzhen", 33.1))
    val d2:Array[(String, Double)] = Array(("beijing", 27.3), ("shanghai", 30.1), ("guangzhou", 33.3))
    val d3:Array[(String, Double)] = Array(("beijing", 28.2), ("shanghai", 29.1), ("guangzhou", 32.0), ("shenzhen", 32.1))

    d1.union(d2).union(d3)
      .toList
      .groupBy(_._1)
      .map(e=>{
        (e._1,e._2.map(e1=>{
          e1._2
        }))
      })
      .map(e=>{
        (e._1,(e._2.sum/e._2.size).formatted("%.2f"))
      })
      .toList
      .sortBy(_._2)
      .reverse
      .foreach(println)
  }*/

  //找到共同的朋友
  /*def findCommonFriends(p1:String,p2:String):Seq[String] ={
    val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\info.txt")

    val list:List[List[String]] = source
      .getLines()
      .map(line => {
        if (line.startsWith(p1) || line.startsWith(p2)) {
          val str:String = line.substring(2)
          str.split(",").toList
        } else {
          null
        }
      })
      .filterNot(_ == null)
      .toList

    list.head.intersect(list(1))


  }

  def main(args:Array[String]):Unit = {
    println(findCommonFriends("C", "B"))
  }*/

  //实现join
  /*  def main(args:Array[String]):Unit = {
      val userSource:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\user.txt")
      val orderSource:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\orders.txt")

      val list:List[(String, String)] = userSource
        .getLines()
        .map(e => {
          val arr:Array[String] = e.split(",", 2)
          (arr(0), arr(1))
        })
        .toList

      val list1:List[(String, String)] = orderSource
        .getLines()
        .map(e => {
          val arr:Array[String] = e.split(",")
          (arr(0), arr(1))
        })
        .toList

      val l1 = new ListBuffer[String]()
      list1.foreach(e => {
        list.foreach(e1 => {
          if (e._2.equals(e1._1)) {
            l1.append(s"${e._1},${e._2},${e1._2}")
          }
        })
      })
    }*/

  //线段点重合案例
  def main(args:Array[String]):Unit = {
    val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\line.txt")
    source
      .getLines()
      .flatMap(e => {
        val arr:Array[String] = e.split(",")
        val arr1:immutable.IndexedSeq[Int] = for (i <- arr(0).toInt to arr(1).toInt by 1) yield i
        arr1
      })
      .toList
      .groupBy(e => e)
      .map(e => {
        (e._1, e._2.size)
      })
      .toList
      .sortBy(-_._2.toInt)
      .foreach(println)

  }


}
