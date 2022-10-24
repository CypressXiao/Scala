package ScalaDay06

object PartialFunctionDemo {
  def main(args:Array[String]):Unit = {
    val ls:_root_.scala.collection.immutable.List[Any] = List[Any](1, 2, 3, 4.0, 5.0, "hello", "java", 'a', true)

    /*val list:List[Any] = ls.filter(e => {
      e.isInstanceOf[Int] || e.isInstanceOf[Double]
    })

    println(list.map {
      case i:Int =>
        i * 10
      case e:Double =>
        e * 10
    })*/

    println(ls.collect(pf))

   println( ls.collect {
     case i:Int => i * 10
     case i:Double => i * 10
   })



  }

  val pf:PartialFunction[Any, Any] = new PartialFunction[Any, Any] {
    override def isDefinedAt(x:Any):Boolean = {
      x.isInstanceOf[Int] || x.isInstanceOf[Double]
    }

    override def apply(v1:Any):Any = {
      v1 match {
        case i:Int =>
          i * 10
        case _ =>
          v1.asInstanceOf[Double] * 10
      }
    }
  }
}
