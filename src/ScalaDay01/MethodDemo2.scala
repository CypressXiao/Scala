package ScalaDay01

object MethodDemo2 {
  def sum(a:Int,b:Int,c:Int):Int ={
    a+b+c
  }

  def concat(str1:String,str2:String):String ={
    str1 + str2
  }

  def max(a:Double,b:Double):Double ={
    if(a>b){
      a
    }else{
      b
    }
  }

  //多个参数:数据类型*
  def sum1(n:Int*):Int ={
    var sum = 0
    for (elem <- n) {
      sum += elem
    }
    sum
  }

  def show(){
    println("Hello!")
  }

  def get():String={
    "Hello!"
  }

  def show1(a:Any){
    println(a)
  }




  def main(args: Array[String]): Unit = {
    println(concat("Jordan","James"))
    println(sum(1, 20, 21))
    println(max(21.3, 23.1))
    println(sum1(1, 3, 1, 45, 21))
    show()
    println(get())
    show1("hello world")
  }

}
