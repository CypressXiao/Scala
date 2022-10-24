package ScalaDay05

object SupremeFuncDemo1 {
  def makeUrl(ssl:Boolean, host:String):(String, String) => String = {
    (key:String, request:String) => {
      if (ssl) {
        s"https://$host?$key=$request"
      } else {
        s"http://$host?$key=$request"
      }
    }
  }

  def main(args:Array[String]):Unit = {
    val f:(String, String) => String = makeUrl(true, "www.doitedu.com")
    val str1:String = f("wd", "java")
    val str2:String = f("subject", "大数据")

    println(str1)
    println(str2)

  }
}
