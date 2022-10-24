package ScalaDay03

case class Student(id:Int,name:String,age:Int) extends Comparable[Student]{
  override def compareTo(o:Student):Int = this.age - o.age
}

//case class 自动生成Bean

