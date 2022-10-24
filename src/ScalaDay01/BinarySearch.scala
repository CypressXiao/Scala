package ScalaDay01

object BinarySearch {
  def binarySearchMethod(arr: Array[Int],elem:Int):Int ={
    if(arr.length == 0 || arr == null){
      return  -1
    }
    val sortedArr = arr.sorted //二分查找必须排序
    var start = 0;
    var end = sortedArr.length-1
    while(start<=end){
      val mid =(start+end)/2
      if(arr(mid)>elem){
        end = mid -1
      }else if(arr(mid) < elem){
        start = mid +1
      }else{
        return mid
      }
    }
    -1
  }

  def main(args: Array[String]): Unit = {
    /*val arr =Array[Int]()
    println(binarySearchMethod(arr, 2))
    )*/
    info(1,Array[String]("zs","ls","ww"))
    Info(2,"zl","tq")
  }

  val info: (Int, Array[String]) => Unit = (id:Int, name:Array[String])=>{
    for (elem <- name) {
      println(s"$elem-$id")
    }
  }

  def Info(id:Int,name:String*):Unit={
    for (elem <- name) {
      println(s"$elem-$id")
    }
  }
}
