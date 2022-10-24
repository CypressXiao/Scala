package ScalaDay04

object ZipDemo {
  def main(args:Array[String]):Unit = {
    val names:_root_.scala.collection.immutable.List[_root_.scala.Predef.String] = List[String]("zss","lss","www")
    val ages:_root_.scala.collection.immutable.List[Int] = List[Int](23,45,31,36)
    val scores:Array[Int] =Array[Int](88,90,100,99)
    /*val tuples:List[(String, Int)] = names.zip(ages)
    tuples.foreach(println)

    val tp:List[((String, Int), Int)] = names.zip(ages).zip(scores)
    println(tp)

    println("====================================================")
    val tp2:List[(String, Int, Int)] = tp.map(e => {
      (e._1._1, e._2, e._1._2)
    })
    tp2.foreach(println)*/

    val tp:List[(String, Int)] = names.zipWithIndex
    tp.foreach(println)

    val tp1:List[((String, Int), Int)] = names.zip(ages).zipWithIndex
    tp1.foreach(e=>{
      println((e._2,e._1._1,e._1._2))
    })


  }

}
