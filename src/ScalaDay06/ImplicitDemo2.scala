package ScalaDay06

import java.io.File

import scala.io.{BufferedSource, Source}

object ImplicitDemo2 {
  /*implicit val myRule:Person1 => Ordered[Person1] = (per:Person1) =>{
    new Ordered[Person1] {
      override def compare(a:Person1):Int = {
        per.id - a.id
      }
    }
  }

  def main(args:Array[String]):Unit = {
    val ls:_root_.scala.collection.immutable.List[_root_.ScalaDay06.Person1] = List[Person1](
      Person1(2,"zss"),
      Person1(1,"lss"),
      Person1(3,"www")
    )

    println(ls.sorted)
  }*/

  implicit val typeChange:File => BufferedSource = (f:File) => {
    Source.fromFile(f)
  }

  def main(args:Array[String]):Unit = {
    val file = new File("C:\\Users\\Cypress_Xiao\\Desktop\\user.txt")
    file.getLines().foreach(println)
  }
}
