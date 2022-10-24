package ScalaDay06


class Person1(val id:Int,val name:String) {
  override def toString = s"Person1($id, $name)"
}

object Person1{
  def apply(id:Int, name:String):Person1 = new Person1(id, name)

  def unapply(arg:Person1):Option[(Int, String)] = {
    if(arg == null){
      None
    }else{
      Some(arg.id,arg.name)
    }
  }
}



