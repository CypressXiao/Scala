package ScalaDay06

import scala.io.{BufferedSource, Source}

object TestIterator {
  def main(args:Array[String]):Unit = {

    val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\info.txt")
    val lines:Iterator[String] = source.getLines()
    lines.foreach(println)

  }

}
