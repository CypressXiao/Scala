package ScalaDay04

import java.util.Comparator

object SortDemo {
  def main(args:Array[String]):Unit = {
    val stus:_root_.scala.collection.immutable.List[_root_.ScalaDay04.Student] =List[Student](
      Student(1,"gy",42,41),
      Student(2,"jyj",38,60),
      Student(3,"lh",22,99),
      Student(4,"zyz",23,88),
      Student(5,"zq",24,50),
      Student(6,"pwh",22,60)
    )

   implicit val ct:Ordering[Student] = new Ordering[Student]() {
      override def compare(o1:Student, o2:Student):Int = {
        if(o2.score.compare(o1.score) == 0){
          o1.age.compare(o2.age)
        }else{
          o2.score.compare(o1.score)
        }
      }
    }

    println(stus.sorted)

    println(stus.sortWith((s1, s2) => s1.id > s2.id))
  }

}
