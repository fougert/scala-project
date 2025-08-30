import scala.collection.mutable.ArrayBuffer

/**
 * @Author luhuan
 * @create 2025/8/26 
 * @description  函数测试
 */
object FunctionTest {

  def main(args: Array[String]): Unit = {

    /* def f(s: String): String = {
      return s+ " test";
    }

    def f2(s: String): String =  s + " test";

    println(f("hello"))
    println(f2("hello"))*/


   /* //定义一个函数:  参数包含数据和逻辑函数
    def operation(arr: Array[Int], op: Int => Int) = {
      for (elem <- arr) yield op(elem)
    }*/

    //println(operation(Array(1, 2, 3, 4), ele => ele + 1).mkString(","))

    /*//定义逻辑函数
    def op(ele: Int): Int = {
      ele + 1
    }*/

   /* //标准函数调用
    val arr = operation(Array(1, 2, 3, 4), op);
    println(arr.mkString(","))*/


    //匿名函数调用
    /*val arr1 = operation(Array(1, 2, 3, 4), (ele: Int) => {
      ele + 1
    })
    println(arr1.mkString("."))*/




    /*def calculator(a: Int, b: Int, op: (Int, Int) => Int): Int = {
      op(a, b)
    }

    //标准调用
    println(calculator(2, 3, (x: Int, y: Int) => {x + y}))

    //只有一行 大括号可以省略
    println(calculator(2, 3, (x: Int, y: Int) => x + y))

    //参数类型可以省略 会根据形参自动进行推导
    println(calculator(2, 3, (x, y) => x + y))

    //如果参数只出现一次 则参数省略且后面参数可以根据 _ 代替
    println(calculator(2, 3, _ + _))*/



    //filter 过滤
    def filter(arr: Array[Int], op: Int => Boolean): Array[Int] = {
      var arr1: ArrayBuffer[Int] = ArrayBuffer[Int]()
      for (elem <- arr) {
        if (op(elem)) {
          arr1.append(elem)
        }
      }
      arr1.toArray
    }

    var arr1 = filter(Array(1,2,3,4), _ % 2 == 1)
    println(arr1.mkString(","))

  }

}
