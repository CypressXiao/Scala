package ScalaDay03



object CollectionMethodDemo1 {
  def main(args:Array[String]):Unit = {

  }
  val arr:Array[Int] = Array(1,32,23,4,234,21)

  println(arr.slice(1, 2).toList) //左闭右开
  println(arr.take(3).toList)
  arr.tails.foreach(e=> println(e.toList))

  println(arr.sortBy(e => (-e)).mkString(","))
  println(arr.sorted.mkString(","))


  val students:List[Student] = List[Student](
    Student(1, "zss", 34),
    Student(2, "lss", 24),
    Student(3, "ww", 18),
    Student(4, "zl", 43)
  )
  println(students.sorted)
  println(students.sortBy(e => -e.id))


}
