package ScalaDay01

import scala.util.Random

object OperateDemo1 {
  def main(args: Array[String]): Unit = {
    val arr = Array[String](xs ="Jordan","James","Kobe","Oneal","Deacon")
    val arr1 = Array[Int](xs =1,2,3,4,5)

    println(arr1(3))

    val ran = new Random()
    val index = ran.nextInt(arr.length)
    val name =arr(index)

    println(s"-------$name-------")

    if("Jordan".equals(name)){
      println(s"$name The god of basketball")
    }else if("James".equals(name)){
      println(s"$name Small king")
    }else if("Kobe".equals(name)){
      println(s"$name Mamba")
    }else{
      println(s"$name All star")
    }
  }
}
