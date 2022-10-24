package ScalaDay04

case class Student(id:Int,name:String,age:Int,score:Int) extends Comparable[Student]{
  override def compareTo(o:Student):Int = o.score - score
}
