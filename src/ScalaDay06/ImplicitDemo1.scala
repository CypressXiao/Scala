package ScalaDay06

object ImplicitDemo1 {

  implicit val name:String = "zss"
  implicit val age:Int = 27

  implicit def concat(x:Int,str:String):Unit ={

  }

  implicit def concat2(implicit x:Int,str:String): String ={
    str+x
  }

  implicit def concat3(str:String)(implicit x:Int): String ={
    str+x
  }

  def main(args:Array[String]):Unit = {
    println(concat2)

  }

}
