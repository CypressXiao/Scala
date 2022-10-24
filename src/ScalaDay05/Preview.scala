package ScalaDay05

import scala.io.{BufferedSource, Source}

object Preview {
  /*def main(args:Array[String]):Unit = {

    //统计每个天的人数,以及每天不同页面的访问次数
    val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\users.txt")
    source
      .getLines()
      .map(e => {
        val s:Array[String] = e.split(",")
        try {
          (s(0), s(1), s(2), s(3))
        } catch {
          case _:Exception => null
        }
      })
      .filterNot(e => {
        e == null
      })
      .toList
      .groupBy(_._2)
      .map(e => {
        val v:List[(String, String, String, String)] = e._2
        val cnt:Int = v.map(_._1).distinct.size
        val mp1:scala.List[(String, Int)] = v.groupBy(_._4).map(e => {
          (e._1, e._2.size)
        }).toList
        (e._1, cnt, mp1)
      })
      .flatMap(e => {
        e._3.map(e1 => {
          (e._1, e._2, e1._1, e1._2)
        })
      })
      .toList
      .sorted
      .foreach(println)

  }

  implicit val ct:Ordering[(String, Int, String, Int)] = new Ordering[Tuple4[String, Int, String, Int]]() {
    override def compare(x:(String, Int, String, Int), y:(String, Int, String, Int)):Int = {
      if (x._1 == y._1) {
        y._4 - x._4
      } else {
        x._1.compareTo(y._1)
      }
    }
  }*/

  def action(ssl:Boolean, url:String):(String, String) => String = {
    (key:String, request:String) => {
      if (ssl) {
        s"https://$url?$key=$request"
      } else {
        s"http://$url?$key=$request"
      }
    }
  }

  def main(args:Array[String]):Unit = {
    val f:(String, String) => String = action(true, "www.doitedu.com")
    println(f("view", "java"))
    println(f("subs", "大数据"))
  }

}
