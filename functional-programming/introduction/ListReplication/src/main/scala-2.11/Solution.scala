import scala.collection.mutable.ListBuffer

object Solution extends App {

    override def main(args: Array[String]): Unit = {
        println(f(2, List(1, 2, 3, 4, 5, 6)))
    }

    def f(num: Int, arr: List[Int]): List[Int] = {
        implicit val times = num
        arr.flatMap(listOfNum)
    }

    def listOfNum(num: Int)(implicit times: Int): List[Int] = {
        val listBuffer = new ListBuffer[Int]
        (1 to times).foreach(n => listBuffer += num)
        listBuffer.toList
    }
}