package ScalaDay05



object InstanceDemo {
  def main(args:Array[String]):Unit = {
    val value:Class[_] = Class.forName("ScalaDay05.Info")
    val value1:Class[ScalaDay05.Info] = classOf[ScalaDay05.Info]

    println(value)
    println(value1)
  }

}
