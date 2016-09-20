
object Solution {

    private def pentagonal(n: BigInt): BigInt = n * (3 * n - 1) / 2

    def main(args: Array[String]): Unit = {
        val lines = io.Source.stdin.getLines
        for (a <- 1 to lines.next.toInt) {
            println(pentagonal(lines.next.toInt))
        }
    }
}