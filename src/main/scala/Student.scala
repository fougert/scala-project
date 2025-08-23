/**
 * @Author luhuan
 * @create 2025/8/23 
 * @description 定义一个类
 */
class Student(name: String, age: Int) {


  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }


}

/**
 * 引入伴生对象
 */
object Student {
  val school: String = "xuexiao"

  def main(args: Array[String]): Unit = {
    val zhangSan = new Student("zhangSan", 15)
    val lisi = new Student("lisi", 30)
    zhangSan.printInfo()
    lisi.printInfo()
  }

}