package ScalaDay02

object CollectionsMethods {
  def main(args:Array[String]):Unit = {
    val arr = Array[Int](1, 2, 3, 4, 5, 6, 7, 8, 9)
    arr.foreach(e => {
      if (e % 2 == 0) print(e+"\t")
    })
    println()
    println("===================================")

    val mp:Array[Int] = arr.filter(e => (e % 2 == 0))
    println(mp.toList)
    println("===================================")

    val res:Array[Int] = for (elem <- arr if elem % 2 == 1) yield elem
    println(res.toList)

    val users = Array[User](User(1,"zs",23),User(2,"ls",32),User.apply(3,"ww",18))
    println(users.maxBy(_.age))
  }

}
