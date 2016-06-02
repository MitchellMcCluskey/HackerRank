object Solution extends App {

    override def main(args: Array[String]): Unit = {
        println(f(List(10, 9, 8, 2, 3, 1, 2)))
    }

    def f(arr: List[Int]): List[Int] = {
        for {
            (v, i) <- arr.zipWithIndex
            if i % 2 == 1
        } yield v
    }

}