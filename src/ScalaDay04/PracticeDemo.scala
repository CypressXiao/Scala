package ScalaDay04


import scala.collection.mutable.ListBuffer
import scala.io.{BufferedSource, Source}
import scala.util.control.Breaks

object PracticeDemo {
  def main(args:Array[String]):Unit = {
    //统计每门功课的最高分数
    val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\score.txt", "UTF-8")
      val mp= source
        .getLines()
        .map(_.split(","))
        .map(e => (e(0), e(1), e(2), e(3).toDouble)) //这个地方必须转成数字类型不然,没得法排序和选最大值
        .toList
        .groupBy(_._3)
        .map(e=>{
          e._2.maxBy(_._4)
        })
      mp.foreach(println)
    source.close()
    println("================================================")
    val source1:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\score.txt", "UTF-8")
    //统计出总分数并排名
    val mp1 = source1
      .getLines()
      .map(_.split(","))
      .map(e => (e(0), e(1), e(2), e(3).toDouble))
      .toList
      .groupBy(_._2)
      .map(e => {
        (e._1, e._2.map(_._4).sum)
      })
      .toList
      .sortBy(-_._2)

    //连续排名
    var j:Int = 1
    val list = new ListBuffer[Int]()
    list.append(j)
    for (i <- 1 until mp1.length) {
      Breaks.breakable({
        if (mp1(i)._2 == mp1(i - 1)._2) {
          list.append(j)
          Breaks.break()
        }else {
          j += 1
          list.append(j)
        }
      })
    }

    mp1.zip(list).map(e => {
      (e._1._1, e._1._2, e._2)
    }).foreach(println)


  }

}
