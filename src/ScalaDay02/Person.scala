package ScalaDay02

class Person(val id:Int, val name:String) {

  override def toString = s"Person($id, $name)"
}

object Person{
  def apply(id:Int, name:String):Person = new Person(id, name)
  def apply(name:String):Unit = println(s"$name,你好!")
}
