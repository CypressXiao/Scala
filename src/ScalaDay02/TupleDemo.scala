package ScalaDay02

object TupleDemo {
  def main(args:Array[String]):Unit = {
    val tp = (1,"ls",23)
    val tp1 = new Tuple3(2, "ls", 24)
    val iterator = tp.productIterator
    while(iterator.hasNext){
      println(iterator.next())
    }

  }

}
