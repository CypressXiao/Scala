package ScalaDay03

import scala.io.Source

object Preview {
  def main(args:Array[String]):Unit = {
    /*val mp:_root_.scala.collection.immutable.List[(_root_.java.lang.String, Int)] = Source
      .fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt")
      .getLines()
      .flatMap(_.split("\\s+"))
      .map(_.toLowerCase)
      .map((_, 1))
      .toList
      .groupBy(_._1)
      .mapValues(_.size)
      .toList
      .sortBy(_._1)

    mp.foreach(println)*/

    /*Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt")
      .getLines()
      .flatMap(_.split("\\s+"))
      .map(_.toLowerCase)
      .map((_,1))
      .toList
      .groupBy(_._1)
      .mapValues(_.size)
      .foreach(println)*/

    Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\word.txt")
      .getLines()
      .flatMap(_.split("\\s+"))
      .map(_.toLowerCase)
      .toList
      .groupBy(e=>e)
      .mapValues(_.size)
      .foreach(println)
  }

}
