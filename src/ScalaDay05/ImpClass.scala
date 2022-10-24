package ScalaDay05

class ImpClass extends TraitDemo with TraitDemo2 {
  override def a:Unit ={
    println("没有返回值抽象方法!")
  }

  override def add(x:Int, y:Int):Int = {
    x+y
  }

  override def b:Unit = {
    println("第二个实现的接口中的抽象方法!")
  }
}
