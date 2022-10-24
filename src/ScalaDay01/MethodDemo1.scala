package ScalaDay01

object MethodDemo1 {
  def add(a:Int,b:Int,c:Int):Int ={
    return a+b+c
  }
  def add1(a:Int,b:Int,c:Int) ={
    a+b+c
  }
  def add2(a:Int,b:Int,c:Int){
    print(a+b+c)
  }

  def main(args: Array[String]): Unit = {
    println(add(1,2,3))
    println(add1(1,2,3))
    add2(1,2,3)

  }

}
