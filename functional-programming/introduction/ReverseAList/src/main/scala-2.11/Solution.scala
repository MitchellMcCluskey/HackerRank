object Solution extends App {

    override def main(args: Array[String]): Unit = {
        println(f(List(1, 2, 3, 4, 5)))
    }

    def f(arr: List[Int]): List[Int] = arr.reverse

}