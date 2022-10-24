package ScalaDay04

object _交集并集差集 {
  def main(args:Array[String]):Unit = {
    /*
    intersect 交集
    diff 差集
    union 并集
    distinct 去重
     */
    val ls:_root_.scala.collection.immutable.List[Int] = List[Int](1,2,3,4,5,6)
    val ls1:_root_.scala.collection.immutable.List[Int] = List[Int](4,5,6,7,8,9)

    val l1:List[Int] = ls1.intersect(ls)
    println(l1)

    println(ls.diff(ls1))
    println(ls1.diff(ls))
    println(ls.diff(ls1) :: ls1.diff(ls))

    println(ls.diff(ls1).union(ls1.diff(ls)))
    println(ls.union(ls1).distinct)



  }

}
