package ScalaDay04

object GroupByDemo {
  def main(args:Array[String]):Unit = {
    /*val ls = List("java","sql","js","hbase","hive","hadoop","spark","flink")
    val gp:Map[Boolean, List[String]] = ls.groupBy(_.startsWith("h"))
    println(gp.map(e => {
      s"${e._1}:${e._2.mkString("-")}"
    }))

    val gp1:Map[Int, List[String]] = ls.groupBy(e => (e.hashCode & Int.MaxValue)% 3)
    gp1.foreach(println)*/

  }

  /*val ls1:Seq[Student] = List[Student](
    Student(1,"zss","beijing"),
    Student(2,"lss","shanghai"),
    Student(3,"ww","beijing"),
    Student(4,"zl","chengdu"),
    Student(5,"tq","chengdu"),
  )

  ls1.groupBy(_.addr).foreach(println)*/


}
