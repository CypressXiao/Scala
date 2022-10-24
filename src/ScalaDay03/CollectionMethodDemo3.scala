package ScalaDay03

import java.sql.DriverManager

import scala.collection.mutable
import scala.io.{BufferedSource, Source}

object CollectionMethodDemo3 {
  def main(args:Array[String]):Unit = {
    /*val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt")
    val lines:Iterator[String] = source.getLines()
    val mp = new mutable.HashMap[String, Integer]()
    val arr1:Unit = lines.foreach(line => {
      val arr:Array[String] = line.split("\\s+")
      arr.foreach(elem1 =>{
        val elem:String = elem1.toLowerCase
        if(!mp.contains(elem)){
          mp.put(elem,1)
        }else{
          val i:Int = mp.getOrElse(elem, 1).asInstanceOf[Int]
          mp.put(elem,i+1)
        }
      })
    })
    for (elem <- mp) {
      println(elem)
    }*/

    /*val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt")
    val lines:Iterator[String] = source.getLines()
    val arr1:scala.List[_root_.scala.Array[_root_.scala.Predef.String]] = lines.map(line => {
      val arr:Array[String] = line.split("\\s+")
      arr
    }).toList

    val words:List[String] = arr1.flatten
    val mp = new mutable.HashMap[String, Int]()
    for (elem1 <- words) {
      val elem:String = elem1.toLowerCase
      mp.put(elem,mp.getOrElse(elem, 0)+1)
    }
    mp.toList.sortBy(-_._2).slice(0,3).foreach(println)*/

    Source
      .fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt")
      .getLines()
      .flatMap(e => e.split("\\s+")
      .map(e => e.toLowerCase)).toList
      .groupBy(e => e)
      .map(e => (e._1, e._2.size))

    println(Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt").getLines().flatMap(e => e.split("\\s+"))
      .map(word => word.toLowerCase).toList.groupBy(e => (e, 1)).map(word => {
      (word._1._1, word._2.size)
    }))

    println(Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt").getLines().flatMap(e => e.split("\\s+"))
      .map(_.toLowerCase).map(word => (word, 1)).toList.groupBy(word => word._1).map(word => {
      (word._1, word._2.map(_._2).sum)
    }))

    val it:scala.List[_root_.java.lang.String] = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt").getLines().flatMap(e => e.split("\\s+"))
      .map(_.toLowerCase).toList
    val tuples:List[(String, Int)] = it.map(word => (word, 1))
    val mp:Map[String, List[(String, Int)]] = tuples.groupBy(e => e._1)
    println(mp.map(word => {
      (word._1, word._2.size)
    }))

  }
}
