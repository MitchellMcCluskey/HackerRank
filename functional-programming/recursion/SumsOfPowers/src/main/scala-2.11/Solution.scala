import scala.util.control.Breaks

object Solution {

    def numberOfWays(x: Int, n: Int): Int = {
        val a = new Array[Int](x + 1)
        a(0) = 1
        val b = new Breaks
        b.breakable {
            for (i <- 1 to x) {
                val powerLimit = math.pow(i, n).toInt
                if (powerLimit > x) b.break
                for (j <- 0 to x - powerLimit) a(x - j) += a(x - j - powerLimit)
            }
        }
        a(x)
    }

    def main(args: Array[String]) {
        println(numberOfWays(readInt(),readInt()))
    }
}