package ScalaDay04

object SlidingDemo{
  def main(args:Array[String]):Unit = {
    /*val ls:List[String] = List[String]("a","b","c","d","e","f")
    println(ls.slice(1, 4))

    val iterator:Iterator[List[String]] = ls.sliding(3,2)
    iterator.foreach(println)
*/
    val ls1:_root_.scala.collection.immutable.List[Int] = List[Int](1,2,3,4,5,6,7,8)

    for(i <- ls1.indices by 1){
      println(ls1.slice(i, i + 2).sum)
    }

    println("=================================================")
    ls1.sliding(2,1).foreach(e=>println(e.sum))
  }
}
