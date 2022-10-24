package ScalaDay03

object CollectionMethodDemo2 {
  def main(args:Array[String]):Unit = {
    val ls = List(1, 2, 3, 4, 5, "java", "js", "sql", true, 'a')

    ls.foreach(elem => {
      if (elem.isInstanceOf[Int]) {
        val i:Int = elem.asInstanceOf[Int]
        println(i * i)
      }
    })

    println(ls.filter(_.isInstanceOf[Int]).map(e => Math.pow(e.asInstanceOf[Int], 2).toInt))

    val ints:List[Int] = for (elem <- ls if elem.isInstanceOf[Int]) yield {
      val i:Int = elem.asInstanceOf[Int]
      i * i.toInt
    }
    println(ints)

    val value:PartialFunction[Any, String] = new PartialFunction[Any, String] {
      override def isDefinedAt(x:Any):Boolean = {
        x.isInstanceOf[String]
      }

      override def apply(v1:Any):String = {
        v1.asInstanceOf[String].toUpperCase

      }
    }
    println(ls.collect(value))
    println("==================================================")
    ls.collect({
      case elem:String => elem.toUpperCase
      case elem:Int => elem * 10
    }).foreach(println)


    def myPart():PartialFunction[Any, Int] = {
      new PartialFunction[Any, Int] {
        override def isDefinedAt(x:Any):Boolean = {
          x.isInstanceOf[Int]
        }

        override def apply(v1:Any):Int = v1.asInstanceOf[Int]*10
      }
    }

    val ints1:List[Int] = ls.collect(myPart())
    println(ints1)

  }
}
