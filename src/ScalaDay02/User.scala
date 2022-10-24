package ScalaDay02

class User (val id:Int,val name :String,val age:Int) extends Comparable[User]{


  override def toString = s"User($id, $name, $age)"

  override def compareTo(o:User):Int = {
    this.age -  o.age
  }
}



object User{

  val user:(Int, String, Int) => User = (id:Int, name:String, age:Int) =>{
    new User(id,name,age)
  }
  def apply(id:Int, name:String, age:Int):User = new User(id, name, age)

  def apply(a:Int,b:Int):Int ={
    a*b
  }

  def apply(id:Int,name:String):Unit = println(s"$id $name Hello user!")

  def apply():(Int, String, Int) => User = user

}
