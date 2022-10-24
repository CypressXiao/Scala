package ScalaDay01

import java.util.UUID

import scala.util.control.Breaks

object WhileDemo1 {
  def main(args: Array[String]): Unit = {
    /*while (true) {
      val uuid = UUID.randomUUID()
      println(uuid)
      Thread.sleep(1000)
    }*/

    /* var flag = true
    for(i <- 1 to 10 if flag){
      println(i)
      if(i == 5){
        flag = false
      }
    }*/


    val breaks = new Breaks
    breaks.breakable {
      for (i <- 1 to 10) {
        println(i)
        if (i == 5) {
          breaks.break()
        }
      }
    }
    println("还有")
  }
}
