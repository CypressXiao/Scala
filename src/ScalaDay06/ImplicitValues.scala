package ScalaDay06

object ImplicitValues {
  val  a:String = "hello"

  implicit  val b:Int = 10

  implicit def changeType(a:A):AA ={
    new AA
  }

  implicit class B(a:A) {
    def cc():Unit ={
      println("bb.............................")
    }
  }


}
