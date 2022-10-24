package ScalaDay05

class _万能实现类(){ //没有继承任何的特质

}

object _万能实现类{
  def main(args:Array[String]):Unit = {
    new _万能实现类 with  TraitDemo with TraitDemo2 {
      override def a:Unit = {
        println("我创建对象时,实现了traitdemo")
      }
      override def add(x:Int, y:Int):Int = ???

      override def b:Unit = ???
    }
  }
}

