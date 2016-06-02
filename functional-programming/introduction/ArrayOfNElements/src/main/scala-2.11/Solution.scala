object Solution extends App {

    override def main(args: Array[String]): Unit = {
        println(f(10))
    }

    def f(num: Int): List[Int] = List.fill(num)(1)

}