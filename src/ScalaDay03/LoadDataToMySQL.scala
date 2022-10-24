package ScalaDay03

import java.sql.{Connection, DriverManager, PreparedStatement}

import scala.io.{BufferedSource, Source}

object LoadDataToMySQL {
  def main(args:Array[String]):Unit = {
    val source:BufferedSource = Source.fromFile("C:\\Users\\Cypress_Xiao\\Desktop\\data.txt")
    val lines:Iterator[String] = source.getLines()
    val connection:Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/doit32", "root", "123456")
    val ps:PreparedStatement = connection.prepareStatement("insert into stu values (?,?,?)")
    lines.foreach(line=>{
      val arr:Array[String] = line.split(",")
      ps.setInt(1,arr(0).toInt)
      ps.setString(2,arr(1))
      ps.setInt(3,arr(2).toInt)
      ps.executeUpdate() //执行语句
    })
    ps.close()
    connection.close()


  }
}
