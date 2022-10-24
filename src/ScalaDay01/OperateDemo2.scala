package ScalaDay01

object OperateDemo2 {
  def main(args: Array[String]): Unit = {
    val arr =Array[Int](xs = 1,23,4,21,34,52)
    /*for (elem <- arr) {
      println(elem)
    }
    println("=========================================")
    for(i <- arr.indices){
      println(arr(i))
    }*/
    /*val range1 = 0 to 9 //包含9
    val range2 = 0 until 9 //不包含9
    for (elem <- range1) {
      println(elem)
    }
    for (elem <- range2) {
      println(elem)
    }*/
    multiple
  }

  private def multiple = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        //val s = i*j
        print(s"$i x $j =" + (i * j) + "\t")
      }
      println()
    }
  }
}
