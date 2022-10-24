package ScalaDay02

import scala.collection.mutable.ListBuffer

object ListDemo {
  def main(args:Array[String]):Unit = {
   /* val ls = List[Int](1,2,3,4,5)
    println(ls.head)
    val ls1 = 1::2::3::4::Nil
    println(ls1)
    val ints = ls :+ 11
    println(ints)*/

    val lb = ListBuffer[String]("java", "sql", "hive", "hbase", "scala")
    lb.remove(3,1)
    println(lb)
    lb.insert(3,"spark")
    println(lb)
    lb.append("flink")
    println(lb)

    lb.appendAll(lb)
    println(lb)

    val l1 = lb.drop(6)
    println(l1)
    println("=======================================")

    val l2 = l1.map(e => e)
    println(l2)
    println("=======================================")

    l2.foreach(e => print(e+"\t"))
    println()
    println("=======================================")
    for (elem <- l2) {
      print(elem+"\t")
    }
    println()
    println("=======================================")
    for(i <- l1.indices){
      print(l1(i)+"\t")
    }
    println()
    println("=======================================")
    val iterator = l1.iterator
    while(iterator.hasNext){
      print(iterator.next()+"\t")
    }
  }

}
