package ScalaDay06

import scala.util.Random

object PattenMatch {
  def main(args:Array[String]):Unit = {
    val ls1:_root_.scala.collection.immutable.List[Any] = List[Any](1, 2, 3, 4.0, 5.0, "hello", "java", 'a', true)
    /*val random = new Random()
    val index:Int = random.nextInt(ls1.size)
    ls1(index) match {
      case x:Int => println(x * 10)
      case x:Double => println(x*100)
      case x:String => println(x.toUpperCase)
      case _ =>println("我不处理你!")
    }*/

    /*for (elem <- ls1) {
      elem match {
        case x:Int => println(x * 10)
        case x:Double => println(x*100)
        case x:String => println(x.toUpperCase)
        case _ =>println(s"我不处理你!$elem")
      }
    }*/

    ls1.foreach {
      case x:Int => println(x * 10)
      case x:Double => println(x * 100)
      case x:String => println(x.toUpperCase)
      case e => println(s"我不处理你!$e")
    }

  }
}
