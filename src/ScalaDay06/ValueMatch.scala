package ScalaDay06

import scala.collection
import scala.collection.parallel.mutable


object ValueMatch {
  def main(args:Array[String]):Unit = {
    val list = List(1, 2, 3)
    val tp:(Int, String, Int, String) = (1, "zss", 23, "男")
    val tp1:(Int, String, Int) = (2, "lss", 24)
    /*val person = new Person1

    matchValuePlus(person)*/
  }

  def matchValuePlus(para:Any):Any = {
    para match {
      case "hello" => println("你参数是hello!")
      case 1 => println("你参数是1!")
      case List(x, y, z) => println(s"$x $y $z")
      case (id, name, age, gender) => println(s"$name")
      case (id:Int, name:String, age:Int) => println(s"$name")
      case a:Person1 => println("我是一个person类")
      case Person1(id,name) => println(name) //要这样写,必须重写unApply方法
      case e => println(s"当前参数值为:$e")
    }
  }


  /*
  数值类型匹配
   */
  def matchValue():Unit = {
    val ls = List[Any](1, 2, 3, 4, "hello")

    ls.foreach {
      case 1 => println("数字1")
      case 2 => println("数字2")
      case 3 => println("数字3")
      case "hello" => println("我是hello!")
      case _ => println("不存在")
    }
  }
}
