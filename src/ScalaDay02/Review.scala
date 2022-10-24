package ScalaDay02

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}


object Review {
  /*def binarySearch(arr:Array[String],num:String):Int ={
    if(arr.length == 0 || arr == null){
      return -1
    }
    var l = 0;
    var r = arr.length -1
    while(l<=r){
      var mid = (l+r) >> 1
      if(arr(mid) > num){
        r = mid -1
      }else if(arr(mid)<num){
        l = mid +1
      }else{
        return mid
      }
    }
    -1
  }

  def main(args:Array[String]):Unit = {
    val arr = Array[String]("java","python","spark")
    println(binarySearch(arr, "flink"))
  }
  */

  /*def main(args:Array[String]):Unit = {
    val zss = new Person(1, "zss")
    println(zss)

    val lss:Person = Person.apply(2, "lss")
    println(lss.id + lss.name)

    Person.apply("James")
  }*/

  def main(args:Array[String]):Unit = {
    /*val tp:(Int, String, Char, Double) = (1, "lss", '男', 23000.0)
    println(tp._1)
    println(tp._2)
    println(tp._3)
    println(tp._4)
    val tp1 = new Tuple2(2, "www")
    for (elem <- tp1.productIterator) {
      println(elem)
    }*/

    /*val arr:Array[String] = Array[String]("hello", "java", "hive", "spark", "flink")

    for (elem <- arr) {
      println(elem)
    }
    println("============================================")

    for(i<-arr.indices){
      println(arr(i))
    }
    println("============================================")

    val arr1:Array[String] = arr.map(e => e)
    for (elem <- arr1) {
      println(elem)
    }
    println("============================================")

    arr.foreach(println)
    println("============================================")

    for (elem <- arr.iterator) {
      println(elem)
    }*/

    /*val ab:ArrayBuffer[Int] = ArrayBuffer[Int](1, 2, 3, 4)
    val ab1:ArrayBuffer[Int] = ab.filter(e => (e > 3))
    println(ab1.toList)

    val persons:Array[Person] = Array[Person](Person(1, "zss"), Person(8, "lss"), Person(3, "www"))
    println(persons.maxBy(Person => Person.id))
    println(persons.minBy(Person => Person.id))*/

    /*val l1:ListBuffer[Int] = ListBuffer[Int](1, 9, 4, 7, 5)
    l1.toStream.filter(e=>(e>4)).sorted.foreach(println)

    val mp:mutable.HashMap[Int, String] = mutable.HashMap[Int, String]((1,"zss"),(2,"lss"))
    println(mp)

    val mp1:_root_.scala.collection.mutable.HashMap[Int, _root_.scala.Predef.String] = mutable.HashMap[Int,String](1->"www",2->"zll")
    println(mp1)

    for (elem <- mp) {
      println(elem._1)
      println(elem._2)
    }
    println("===========================================================")

    for (elem <- mp.keys) {
      println(elem)
      println(mp1.getOrElse(elem,-1))
    }
    println("===========================================================")

    for (elem <- mp.iterator) {
      println(elem)
    }
*/

  }

}


