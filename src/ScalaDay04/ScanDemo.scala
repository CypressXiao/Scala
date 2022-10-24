package ScalaDay04

object ScanDemo {
  def main(args:Array[String]):Unit = {
    val ls = List[String]("Jordan","James","Kobe")
    val str:String = ls.fold("BasketPlayers")(_ + "," + _)
    val str1:List[String] = ls.scan("BasketPlayers")(_ + "," + _)
    println(str)
    str1.foreach(println)

    val arr:Array[Int] =Array[Int](88,90,100,99)

  }

}
