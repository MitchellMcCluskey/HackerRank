object Solution extends App {

    override def main(args: Array[String]): Unit = {
        f(5)
    }

    def f(n: Int): Unit = (1 to n).foreach(_ -> println("Hello World"))
}
