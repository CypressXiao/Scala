package ScalaDay04

object FoldDemo {
  def main(args:Array[String]):Unit = {
    val ls:_root_.scala.collection.immutable.List[Int] =List[Int](1,2,3,4,5,6,7)
    println(ls.fold(10)(_ + _))
  }


}


