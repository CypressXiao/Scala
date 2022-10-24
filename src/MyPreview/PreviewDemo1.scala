package MyPreview




object PreviewDemo1 {
  def main(args:Array[String]):Unit = {
    /*println(arrOperation(arr,func).toList)
    println(func1(0)("")('0'))*/


  }

  def arrOperation(arr:Array[Int], f:Int => Int):Array[Int] = {
    arr.map(e => (f(e)))
  }

  val arr:Array[Int] = Array[Int](1, 2, 3, 4, 5, 6)
  val func:Int => Int = (a:Int) => a * 2
  val fun:(Int, String, Char) => Boolean = (a:Int, b:String, c:Char) => {
    if (a == 0 && "".equals(b) && c == '0') {
      true
    } else {
      false
    }
  }

  val func1:Int => String => Char => Boolean = (a:Int) => {
    (b:String) => {
      (c:Char) =>
        if (c != '0') true
        else false
    }
  }

  /*println(addByA(3)(4))

  def addByA(a:Int):Int => Int = a + _

  def addCurrying(a:Int)(b:Int):Int = a + b

  println(addCurrying(10)(30))

  def recur(n:Int):Int = {
    if (n == 1) {
      1
    } else {
      n * recur(n - 1)
    }
  }

  println(recur(5))*/


  //传值参数
  def f1(a:Int):Unit = {
    println("a" + a)
    println("a" + a)
  }

  def f2():Int = {
    println("我是传名参数!")
    12
  }

  f1(f2())

  /*def f3(a:( => Int)):Unit = {
    println("a" + a)
    println("a" + a)
  }
*/



}
