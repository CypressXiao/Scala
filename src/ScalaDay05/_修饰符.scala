package ScalaDay05

class _修饰符(private[ScalaDay05] val id:Int) {
  private[ScalaDay05] val name:String ="zss"
  private[this] val age:Int = 10

}

object _修饰符{

  def main(args:Array[String]):Unit = {
    val value = new _修饰符(2)
    //value.age
  }
}
