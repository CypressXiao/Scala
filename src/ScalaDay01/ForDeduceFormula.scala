package ScalaDay01

import scala.collection.mutable.ArrayBuffer

object ForDeduceFormula {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    /*//定义一个可变数组
    val arr1 = ArrayBuffer[Int]()

    for (elem <- arr if elem % 2 ==1) {
      arr1.append(elem)
    }
    println(arr1)*/

    //yield关键字将满足条件的数字收集起来
    val res:Array[Int] = for (elem <- arr if elem %2 ==1) yield elem
    println(res.toList)

    val res1:Array[Int] = for (elem <- arr if elem %2 ==0) yield elem*10
    println(res1.toList)

    //代码块返还最后一行代码的值,如果为表达式,则返回()
    val res2:Array[String] = for(e <- arr if e % 2 == 0) yield {
      val e1 = e * 100
      val e2 = e1+"hello"
      e2.toUpperCase()
    }
    println(res2.toList)

    //for循环中的步进,增强for中无
    for(i <- 1 to 20 by 5){
      print(i+"\t")
    }
  }

}
