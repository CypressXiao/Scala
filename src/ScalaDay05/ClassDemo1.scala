package ScalaDay05

class ClassDemo1(val id:Int,var name:String,val age:Int) {
  val gender = "男"
  var addr:Any = _

  def this(id:Int,name:String,age:Int,addr:Int){
    this(id,name,age)
    this.addr = addr;
  }


  def show():Unit ={
    println(s"$id $name $age")
  }
}

object ClassDemo1{
  def apply(id:Int, name:String, age:Int):ClassDemo1 = new ClassDemo1(id, name, age)

  def main(args:Array[String]):Unit = {

  }
}
