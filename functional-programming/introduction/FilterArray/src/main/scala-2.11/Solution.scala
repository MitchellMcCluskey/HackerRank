object Solution extends App {

    override def main(args: Array[String]): Unit = {
        println(f(3, List(10, 9, 8, 2, 3, 1, 2)))
    }

    def f(delim: Int , arr: List[Int]): List[Int] = arr.filter(_ < delim)

}