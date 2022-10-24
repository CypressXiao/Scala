package ScalaDay01

import scala.util.Random

object FunctionProgramming {
  /*def main(args: Array[String]): Unit = {
    var a:Int = 12
    val b:Int = 23
    a = 32
    println(a+b)
  }*/

  val str1:String ={
    val random = new Random()
    val ran = random.nextInt(10)
    if(ran >5) ran+"大" else ran+"小"
  }

  def main(args: Array[String]): Unit = {
    //println(str1)
    /*for(i <- 1 to 10 if i% 2 == 1 && i>3){
      print(i+"\t")
    }*/

    /*var flag = true
    var count = 0
    while(flag){
      count +=1
      if(count>=10){
        flag = false
      }
      print(s"hello!-$count\t")
    }*/
    /*val arr = Array[String](xs ="hello","world","java")
    for (elem <- arr) {
      print(elem+"\t")
    }

    for(i <- arr.indices){
      print(arr(i)+"\t")
    }*/
    println(multi(2, 3, 4))
    println(add(3, 4, get))

    val arr = Array[String](xs ="hello","world","java","scala","spark","flink")

    val res = for(i <- arr.indices if i>1) yield arr(i)+"---"+"i"
    print(res.toList)
  }
  def multi(a:Int*): Int ={
    var m = 1
    for (elem <- a) {
      m *= elem
    }
    m
  }

  val get: (Int, Int) => Int = (a:Int, y:Int) =>{
    a+y
  }

  def add(x:Int,y:Int,f:(Int,Int)=>Int): Int ={
    f(x,y)
  }
}
