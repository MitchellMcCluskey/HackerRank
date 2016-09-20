
object Solution {

    private def prime(n: Int): Boolean = !(n < 2) && !(2 until n - 1).exists(n % _ == 0)

    private def reduceLeftPrime(n: Int): Boolean = {
        if (n.toString.length == 1) prime(n)
        else prime(n) && reduceLeftPrime(n.toString.tail.toInt)
    }

    private def reduceRightPrime(n: Int): Boolean = {
        if (n.toString.length == 1) prime(n)
        else prime(n) && reduceRightPrime(n.toString.dropRight(1).toInt)
    }

    private def containsZero(n: Int): Boolean = n.toString.contains('0')

    def main(args: Array[String]): Unit = {
        val lines = io.Source.stdin.getLines
        for (a <- 1 to lines.next.toInt) {
            println {
                lines.next.toInt match {
                    case n if prime(n) && !containsZero(n) && reduceLeftPrime(n) && reduceRightPrime(n) => "CENTRAL"
                    case n if prime(n) && !containsZero(n) && reduceLeftPrime(n) => "LEFT"
                    case n if prime(n) && !containsZero(n) && reduceRightPrime(n) => "RIGHT"
                    case _ => "DEAD"
                }
            }
        }
    }
}