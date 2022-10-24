package ScalaDay04

object Reduce {
  def main(args:Array[String]):Unit = {
    val ls:_root_.scala.collection.immutable.List[Int] = List[Int](1,2,3,4,5,6)

    println(ls.reduce((x1, x2) => x1 * x2))
    println(ls.product)
  }

}
