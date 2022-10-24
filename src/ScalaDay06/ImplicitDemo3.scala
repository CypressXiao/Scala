package ScalaDay06



object ImplicitDemo3 {
  import ImplicitValues._ //类.下划线代表全部内容,还可以.指定内容

  implicit def add(x:Int)(implicit y:Int):Unit ={
    println(x + y)
  }


  def main(args:Array[String]):Unit = {
    add(10)

    val a1 = new A
    a1.a()
    a1.aa()
    a1.bb()
    a1.cc()

  }



}
