package ScalaDay01

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


object Test {
  /*/*
  1、定义一个高阶函数，按照指定的规则对集合里面的每个元素进行操作
  比如: Array("spark","hello","java","hadoop")
  规则: 对集合中每个元素进行操作，得到集合每个元素的长度
 */
  def main(args: Array[String]): Unit = {
    val arr = Array[String](xs ="spark","hello","java","hadoop")

    val lenList = getLenList(arr, len)
    print(lenList.mkString(","))
  }
  //方法
  def getLenList(arr:Array[String],func:String => Int): Array[Int] ={
    for (elem <- arr) yield func(elem)
  }
  //函数
  val len: String => Int = (a:String) => a.length*/


  /*/*
  2.定义一个高阶函数，对数据中的元素按照指定的规则进行过滤
  比如: Array(1,4,7,9,10,6,8)
  规则: 只保留偶数数据
   */
  def main(args: Array[String]): Unit = {
    val arr =Array[Int](xs = 1,4,7,9,10,6,8)
    val res = getNum(arr, num)
    print(res.mkString(","))
  }

  def getNum(arr:Array[Int],func:Array[Int] => Array[Int]): Array[Int] ={
    func(arr)
  }
  val num: Array[Int] => Array[Int] = (arr:Array[Int]) =>{
    for (elem <- arr if elem % 2 == 0) yield elem
  }*/

  /*/*
  3、对数据中的元素按照指定规则进行分组
  比如:Array("zhangsan shenzhen man","lisi beijing woman","zhaoliu beijing man")
  规则: 按照地址进行分组
   */
  def main(args:Array[String]):Unit = {
    val arr:Array[String] = Array[String]("zhangsan shenzhen man", "lisi beijing woman", "zhaoliu beijing man")
    val mp:mutable.HashMap[String, ListBuffer[String]] = mutable.HashMap()
    getRes(arr, mp)
    println(mp)

  }

  def getRes(arr:Array[String], mp:mutable.HashMap[String, ListBuffer[String]]):Unit = {
    for (elem <- arr) {
      val strs:Array[String] = split(elem)
      if (!mp.contains(strs(1))) {
        val lb = new ListBuffer[String]()
        lb.append(strs(0))
        mp.put(strs(1), lb)
      } else {
        val lb1:ListBuffer[String] = mp.apply(strs(1))
        lb1.append(strs(0))
        mp.put(strs(1), lb1)
      }
    }
  }

  def split(str:String):Array[String] ={
    val arr:Array[String] = str.split("\\s")
    arr
  }*/

  /*
  4、根据指定的规则获取数组中最大元素
  比如:val list = Array(“zhangsan 30 3500”,“lisi 25 1800”,“zhaoliu 29 4500”,“qianqi 30 4500”)
  规则: 获取工资高的人的信息，可能有多个
   */

}
