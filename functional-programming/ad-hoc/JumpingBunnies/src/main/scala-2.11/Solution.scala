
object Solution {

    private def gcd(a: BigInt, b: BigInt): BigInt = if (b == 0) a else gcd(b, a % b)

    private def lcm(numbers: List[BigInt]): BigInt = {
        if (numbers.size == 2) numbers.head * numbers.last / gcd(numbers.head, numbers.last)
        else lcm(List(numbers.head) ++ List(lcm(numbers.tail)))
    }

    def main(args: Array[String]): Unit = {
        val lines = io.Source.stdin.getLines
        val totalBunnies = lines.next.toInt
        val bunnies = lines.next.split(" ").map(BigInt.apply).toList
        println(lcm(bunnies))
    }
}