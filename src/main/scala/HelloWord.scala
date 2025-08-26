import scala.util.control.Breaks

object HelloWord {

  /**
   * scala 注释
   * @param args
   */
/*  def main(args: Array[String]) = {
    println("Hello Word")
  }*/

  def main(args: Array[String]) = {
    /*for (i <-1 to 3){
      //1 到 3 循环 前后闭合
      print(i + " ")
    }

    for ( i <- 1 until 3){
      // 1 2 前闭后开
      print(i + " ")
    }*/

    //循环步长
    for (i <- 1 to 10 by 2) {
      //1、3、5、7、9
      print(i + " ")
    }

    Breaks().breakable(
      for (i <- 1 to 10){
        println(i + " ")
        //结束循环
        if (i == 5) Breaks.break()
      }
    )

  }

}
