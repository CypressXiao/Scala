package ScalaDay01

object ForDefendMode {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    /*for (elem <- arr) {
      if(elem % 2 == 0){
        println(Math.pow(elem,2).toInt)
      }
    }*/

    //满足守卫模式中条件的数据会进入到循环体
    for (elem <- arr if (elem % 2 == 0 && elem > 3)) {
      println(elem.toInt)
    }
  }

}
