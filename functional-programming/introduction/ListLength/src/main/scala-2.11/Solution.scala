object Solution extends App {

    override def main(args: Array[String]): Unit = {
        f(List(1, 2, 3))
    }

    def f(arr: List[Int]): Int = arr.length
}