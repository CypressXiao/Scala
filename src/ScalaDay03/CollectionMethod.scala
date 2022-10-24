package ScalaDay03

object CollectionMethod {
  val arr:Array[Any] = Array(1, 2, 3, 4, "java", "hive", "spark", "flink")
  val ls = List(1, 23, 3, 5, 48, 21)
  val mp:Map[String, Int] = Map[String, Int](("zss", 23), ("lss", 43))

  def main(args:Array[String]):Unit = {

  }
  println(ls.count(e => e * 2 <= 10))

  val students:List[Student] = List[Student](
    Student(1, "zss", 34),
    Student(2, "lss", 24),
    Student(3, "ww", 18),
    Student(4, "zl", 43)
  )

  println(students.count(_.age > 25))

  println(students.filter(e => e.age > 23).filter(e => e.id < 4))
  students.foreach(e=>if(e.age>23 && e.id<4){
    println(e)
  })

  println(students.map(e => {
    if (e.age > 23 && e.id < 4) {
      e
    }
  }))
}
