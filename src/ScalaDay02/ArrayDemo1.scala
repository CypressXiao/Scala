package ScalaDay02

import scala.collection.mutable.ArrayBuffer

object ArrayDemo1 {
  def main(args: Array[String]): Unit = {

   /* val arr: Array[Int] =Array[Int](1,2,3,4,5)
    val iterator = arr.iterator

    while(iterator.hasNext){
      println(iterator.next())
    }*/

    /*val arr1 = Array[User](new User,new User,new User)
    for (elem <- arr1) {
      println(elem)
    }*/

    val arrBuffer = ArrayBuffer[Int](1,2,3,4,5)

    /*arrBuffer.+=(11)
    println(arrBuffer)*/

    arrBuffer.++=(Array[Int](54,23,14,52))
    println(arrBuffer)

    arrBuffer.append(12)
    println(arrBuffer)

    arrBuffer.remove(0)
    println(arrBuffer)

    arrBuffer.insertAll(0,Array(2,4,1,6))
    println(arrBuffer)

  }

}
