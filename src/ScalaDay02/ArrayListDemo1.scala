package ScalaDay02

object ArrayListDemo1 {
  val arr1: Array[Int] = Array[Int](1,2,3,4,5)
  val arr2: Array[String] = Array[String]("a","b","c","d")

  //map映射遍历
 val ints: Array[Int] = arr1.map(e => {
    val res1 = e * e
    res1 + 10
  })

  println(ints.toList)

  //foreach遍历
  arr2.foreach(a => print(a.toUpperCase()+"\t"))
  println()

  //for遍历
  for (elem <- arr1) {
    println(elem+"\t")
  }
  println()

  //fori遍历
  for(i <- arr2.indices){
    print(i+"\t")
  }
  println()

  val iterator: _root_.scala.collection.Iterator[_root_.scala.Predef.String] = arr2.toIterator
  while(iterator.hasNext){
  println(iterator.next())
  }




  def main(args: Array[String]): Unit = {

  }

}
