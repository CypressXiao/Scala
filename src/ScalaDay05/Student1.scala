package ScalaDay05

case class Student1(id:Int, name:String, age:Int) extends Comparable[Student1]{
  override def compareTo(o:Student1):Int = this.age - o.age
}

//case class 自动生成Bean

