package ScalaDay02

object ApplyDemo {
  def main(args:Array[String]):Unit = {
    val user = User(1, "zss", 23)
    println(user)

    println(User.apply(10, 20))

    val user1 = User.user(2,"ls",24)
    println(user1)

    User.apply(3,"ww")

    val u1 = User.apply(4,"zl",49)
    println(u1)
  }
}
