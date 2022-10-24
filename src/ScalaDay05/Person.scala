package ScalaDay05

import scala.beans.BeanProperty

class Person {
  val id:Int =1

  @BeanProperty
  var age:Int = _

  def getId:Int ={
    id
  }



}
object Person{
  def main(args:Array[String]):Unit = {
    val person = new Person
    println(person.getId)

    person.setAge(23)
    println(person.getAge)

  }
}
