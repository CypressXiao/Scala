package ScalaDay05

import scala.collection.mutable
import scala.io.{BufferedSource, Source}

object PracticeDemo1 {

  def main(args:Array[String]):Unit = {
    val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\users.txt")

    source
      .getLines()
      .map(e => {
        try {
          val strs:Array[String] = e.split(",")
          Info(strs(0), strs(1), strs(2), strs(3))
        } catch {
          case _:Exception => null
        }
      })
      .filterNot(_ == null)
      .toList
      .groupBy(_.date)
      .map(e => {
        val date:String = e._1
        val ls = e._2
        val peoLs:List[String] = ls.map(_.uid).distinct
        val pageLs = ls.map(_.log)
        val mp2:Map[String, List[String]] = pageLs.groupBy(e => e)
        val pv = mp2.map(tp => {
          (tp._1, tp._2.size)
        }).toList
        (date, peoLs.size, pv)
      })
      .flatMap(e => {
        e._3.map(tp => {
          (e._1, e._2, tp._1, tp._2)
        })
      })
      .toList
      .sorted(comRul)
      .foreach(println)
  }


  implicit val comRul:Ordering[(String, Int, String, Int)] = (x:(String, Int, String, Int), y:(String, Int, String, Int)) => {
    if (x._1 == y._1) {
      x._4 - y._4
    } else {
      x._1.compareTo(y._1)
    }
  }
}
