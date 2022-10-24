package ScalaDay01

object DateTypeDemo1 {
  var num1:Int = _
  def main(args: Array[String]): Unit = {
    var age: Int = 25
    println(age)
    age = 24
    println(age)

    val gender:String ="M"
    val name:String = "Kobe" //val定义不可变的变量
    println(gender,name)

    println(num1)

    var str1 ="北京" //自动类型推导
    println(str1)

    val bool = str1.isInstanceOf[String]
    println(bool)

    //打印多行
    println(
      """
        |我是CEO
        |我是CFO
        |我是CTO
        |""".stripMargin)

    //字符串拼接
    println(s"$name-$gender-$age")

  }
}
